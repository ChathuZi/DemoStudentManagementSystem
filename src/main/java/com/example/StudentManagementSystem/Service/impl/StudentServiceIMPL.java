package com.example.StudentManagementSystem.Service.impl;

import com.example.StudentManagementSystem.Service.StudentService;
import com.example.StudentManagementSystem.dto.StudentDto;
import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepo;
import com.example.StudentManagementSystem.utill.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentDto addStudent(StudentDto studentDto){
        Student student = StudentMapper.mapTOStudent(studentDto);
        Student saveStudent = studentRepo.save(student);
        return StudentMapper.mapToStudentDto(saveStudent);
    }

    @Override
    public List<StudentDto> getAll() {
        List<Student> students = studentRepo.findAll();
        return students.stream().map((student)-> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(int studentId) {
        return null;
    }
}
