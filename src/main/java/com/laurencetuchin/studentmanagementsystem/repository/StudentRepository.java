package com.laurencetuchin.studentmanagementsystem.repository;

import com.laurencetuchin.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
