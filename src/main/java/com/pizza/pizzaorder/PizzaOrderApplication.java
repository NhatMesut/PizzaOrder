package com.pizza.pizzaorder;

import com.pizza.pizzaorder.utils.SslUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaOrderApplication {

    public static void main(String[] args) {
        SslUtil.disableSSLVerification();
        SpringApplication.run(PizzaOrderApplication.class, args);
    }

}
