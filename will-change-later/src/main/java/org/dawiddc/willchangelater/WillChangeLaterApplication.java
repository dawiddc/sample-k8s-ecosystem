package org.dawiddc.willchangelater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WillChangeLaterApplication {

    public static void main(String[] args) {
        System.setProperty("user.timezone", "GMT");
        SpringApplication.run(WillChangeLaterApplication.class, args);
    }
}
