package com.alexis.workingmongodb.repository;

import com.alexis.workingmongodb.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findByEmail(String email);

}
