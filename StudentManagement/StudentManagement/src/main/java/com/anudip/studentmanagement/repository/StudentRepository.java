package com.anudip.studentmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.anudip.studentmanagement.entity.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

}
