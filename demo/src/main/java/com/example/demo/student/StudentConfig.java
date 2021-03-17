package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student pepe = new Student(
                    "Pepe",
                    "pepe@correo.com",
                    LocalDate.of(2000, JANUARY, 25)
            );

            Student Juan = new Student(
                    "Pepe",
                    "alex@correo.com",
                    LocalDate.of(1990, JANUARY, 5)
            );

            repository.saveAll(List.of(pepe,Juan));
        };
    }
}
