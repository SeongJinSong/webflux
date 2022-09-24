package com.study.webflux;

import com.study.webflux.client.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    }

}
