package br.com.jaegeropentracing.example.pix.resource;

import br.com.jaegeropentracing.example.pix.service.AccountServiceClient;
import br.com.jaegeropentracing.example.pix.service.PutAccountServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pix/v1/transfer")
public class PixResource {


    private AccountServiceClient accountClient;
    private PutAccountServiceClient putAccountClient;

    public PixResource(AccountServiceClient accountClient,
                       PutAccountServiceClient putAccountClient) {
        this.accountClient = accountClient;
        this.putAccountClient = putAccountClient;
    }


    @GetMapping(path = "/{value}")
    public String pix(@PathVariable("value") String valor) {

        Boolean valueTakedOut = accountClient.takeOut(valor);
        Boolean valuePutAccount = putAccountClient.putAccount(valor);

        return valueTakedOut && valuePutAccount ? "Transaction OK" : "Transaction Non OK";
    }

}
