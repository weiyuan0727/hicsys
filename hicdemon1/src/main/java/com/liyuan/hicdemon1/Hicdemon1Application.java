package com.liyuan.hicdemon1;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
public class Hicdemon1Application {

    public static void main(String[] args) {
        SpringApplication.run(Hicdemon1Application.class, args);
    }

}
