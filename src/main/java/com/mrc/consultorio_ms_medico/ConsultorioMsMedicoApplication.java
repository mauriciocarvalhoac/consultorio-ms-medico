package com.mrc.consultorio_ms_medico;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultorioMsMedicoApplication implements CommandLineRunner {
    @Value("${spring.datasource.url}")
    String urlDatabase;
    @Value("${server.port}")
    String port;
    @Value("${spring.profiles.active}")
    String env;

    public static void main(String[] args) {
        SpringApplication.run(ConsultorioMsMedicoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Env: " + env);
        System.out.println("Port: " + port);
        System.out.println("URL Database: " + urlDatabase);
        System.out.println("Projeto compilado com sucesso!!");
    }
}
