package com.horrorcore.jdbankapp;

import org.springframework.boot.SpringApplication;

public class TestJdBankAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(JdBankAppApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
