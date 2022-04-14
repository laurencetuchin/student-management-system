package com.laurencetuchin.studentmanagementsystem;

import com.laurencetuchin.studentmanagementsystem.entity.Student;
import com.laurencetuchin.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Tom", "Holland", "tomh@test.com");
		studentRepository.save(student1);

		Student student2 = new Student("Tommy", "Hollando", "tommyholando@test.com");
		studentRepository.save(student1);

		Student student3 = new Student("Tony", "Stark","tonystark@test.com");
		studentRepository.save(student3);
	}
}
