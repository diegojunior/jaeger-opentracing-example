package br.com.jaegeropentracing.example.putaccount.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/accounts")
public class PutAccountResource {

    @PostMapping("/putaccount/{value}")
    public Boolean put(@PathVariable("value") String value) {
        return true;
    }
}
