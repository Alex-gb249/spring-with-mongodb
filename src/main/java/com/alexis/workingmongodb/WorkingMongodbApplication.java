package com.alexis.workingmongodb;

import com.alexis.workingmongodb.models.Address;
import com.alexis.workingmongodb.models.Gender;
import com.alexis.workingmongodb.models.Student;
import com.alexis.workingmongodb.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WorkingMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkingMongodbApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository repository) {
        return args -> {
            Address address = new Address(
                    "Colombia",
                    "Medellín",
                    "055413"
            );
            Student student = new Student(
                    "Alexis",
                    "Bermúdez",
                    "alexis.gb249@gmail.com",
                    Gender.MALE,
                    address,
                    List.of("Programming", "English"),
                    BigDecimal.TEN,
                    LocalDateTime.now()
            );

            repository.save(student);
        };
    }




}
