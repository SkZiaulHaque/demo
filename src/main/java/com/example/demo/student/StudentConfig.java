package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {

        return args -> {
            Student zakir_naik = new Student(
                    "Zakir Naik",
                    "zakir.naik@email.com",
                    LocalDate.of(1965, JANUARY, 5)
            );
            Student jhon_smith = new Student(
                    "Jhon Smith",
                    "jhon.smith@email.com",
                    LocalDate.of(1969, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(zakir_naik, jhon_smith)
            );


        };
    }
}
