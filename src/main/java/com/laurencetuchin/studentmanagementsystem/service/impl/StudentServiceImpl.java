package com.laurencetuchin.studentmanagementsystem.service.impl;

import com.laurencetuchin.studentmanagementsystem.entity.Student;
import com.laurencetuchin.studentmanagementsystem.repository.StudentRepository;
import com.laurencetuchin.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }
}
