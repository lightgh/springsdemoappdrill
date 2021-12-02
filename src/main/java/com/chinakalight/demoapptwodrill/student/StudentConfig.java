package com.chinakalight.demoapptwodrill.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student(1L,
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, APRIL, 5)
            );

            Student alex = new Student(2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, APRIL, 5)
            );

            repository.saveAll(
                    Arrays.asList(maria, alex)
            );
        };
    }
}
