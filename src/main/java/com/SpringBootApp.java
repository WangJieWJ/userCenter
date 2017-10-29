package com;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Title:
 * Description:
 * Project: userCenter
 * Create Time:2017/10/29 15:50
 */
@SpringBootApplication
public class SpringBootApp {


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
