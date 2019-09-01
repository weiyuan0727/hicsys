package com.liyuan.hicdemon2;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
public class Hicdemon2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hicdemon2Application.class, args);
    }

}
