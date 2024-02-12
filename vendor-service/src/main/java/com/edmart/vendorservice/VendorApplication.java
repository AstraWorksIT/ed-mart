package com.edmart.vendorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableEurekaClient
@EntityScan(basePackages = {"com.edmart.vendorservice.entity"})
@SpringBootApplication
@EnableFeignClients(
        basePackages = "com.edmart.client"
)
@EnableCaching
@EnableSwagger2
public class VendorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendorApplication.class, args);
    }
}
