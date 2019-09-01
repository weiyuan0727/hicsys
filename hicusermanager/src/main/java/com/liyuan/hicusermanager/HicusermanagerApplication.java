package com.liyuan.hicusermanager;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCasClient
public class HicusermanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HicusermanagerApplication.class, args);
    }

}
