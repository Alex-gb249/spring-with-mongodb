package com.alexis.workingmongodb.repository;

import com.alexis.workingmongodb.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
