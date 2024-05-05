package com.example.StudentManagementSystem.Service;

import com.example.StudentManagementSystem.dto.StudentDto;
import com.example.StudentManagementSystem.entity.Student;

import java.util.List;


public interface StudentService {
       StudentDto addStudent(StudentDto studentDto);

       //    String addStudent(StudentDTO studentDTO);
       List<StudentDto> getAll();
       StudentDto getStudentById(int studentId);
}
