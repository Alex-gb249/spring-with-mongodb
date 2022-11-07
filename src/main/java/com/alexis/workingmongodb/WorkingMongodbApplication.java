package com.alexis.workingmongodb;

import com.alexis.workingmongodb.models.Address;
import com.alexis.workingmongodb.models.Gender;
import com.alexis.workingmongodb.models.Student;
import com.alexis.workingmongodb.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WorkingMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkingMongodbApplication.class, args);
    }

    /*String email = "alexis.gb249@gmail.com";
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
                    email,
                    Gender.MALE,
                    address,
                    List.of("Programming", "English"),
                    BigDecimal.TEN,
                    LocalDateTime.now()
            );

            repository.findByEmail(email)
                    .ifPresentOrElse(s -> {
                        System.out.println(s + " already exists");
                    }, () -> {
                        System.out.println("Inserting student: " + student);
                        repository.insert(student);
                    });

        };

    }*/

    /*private void emailWithMongoTemplate(StudentRepository repository, MongoTemplate mongoTemplate) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(email));

        List<Student> students = mongoTemplate.find(query, Student.class);

        if (students.size() > 1) {
            throw new IllegalStateException("found many students with email: "+ email);
        }

        if (students.isEmpty()) {
            System.out.println("Inserting student: " + student);
            repository.insert(student);
        } else {
            System.out.println(student + " already exists");
        }
    }*/




}
