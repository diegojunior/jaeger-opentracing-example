package br.com.jaegeropentracing.example.pix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "put-account-service-client", url = "${put.account.service.prefix.url}")
public interface PutAccountServiceClient {

    @PostMapping("/api/v1/accounts/putaccount/{value}")
    Boolean putAccount(@PathVariable("value") String value);
}
