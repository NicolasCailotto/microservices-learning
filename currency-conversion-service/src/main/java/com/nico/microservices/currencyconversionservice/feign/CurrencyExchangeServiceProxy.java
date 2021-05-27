package com.nico.microservices.currencyconversionservice.feign;

import com.nico.microservices.currencyconversionservice.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "netflix-zuul-api-gateway-server") // Se usa el gateway para llegar al servicio
//@FeignClient(name = "currency-exchange-service"/*, url = "localhost:8000"*/) Annotation para usar directamente el servicio sin pasar por el gateway
//@RibbonClient(name = "currency-exchange-service") Eureka ya provee Ribbon por su cuenta
public interface CurrencyExchangeServiceProxy {
    // Se hace el mapeo al servicio pasando por el gateway
    @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

    /* Esto es para usar directamente el servicio sin el gateway
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);*/

}
