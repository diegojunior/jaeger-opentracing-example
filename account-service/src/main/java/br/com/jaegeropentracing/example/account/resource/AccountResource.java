package br.com.jaegeropentracing.example.account.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountResource {

    @PostMapping("/takeout/{value}")
    public Boolean take(@PathVariable("value") String value) {
        return true;
    }
}
