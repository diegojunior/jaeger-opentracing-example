package br.com.jaegeropentracing.example.pix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "acount-service-client", url = "${account.service.prefix.url}")
public interface AccountServiceClient {

    @PostMapping("/api/v1/accounts/takeout/{value}")
    Boolean takeOut(@PathVariable("value") String value);
}
