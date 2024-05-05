package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.Service.StudentService;
import com.example.StudentManagementSystem.dto.StudentDto;
import com.example.StudentManagementSystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public ResponseEntity<List<StudentDto>> getAll(){
        List<StudentDto> students = studentService.getAll();
        return ResponseEntity.ok(students);
    }

    @PostMapping
    public  ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto){
        StudentDto addStudent = studentService.addStudent(studentDto);
        return new ResponseEntity<>(addStudent, HttpStatus.CREATED);
    }


}
