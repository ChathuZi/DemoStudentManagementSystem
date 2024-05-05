package com.example.StudentManagementSystem.utill;

import com.example.StudentManagementSystem.dto.StudentDto;
import com.example.StudentManagementSystem.entity.Student;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface StudentMapper {

    Student studentDtoToStudent(StudentDto studentDto);

    StudentDto studentToStudentDto(Student student);

    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
          student.getId(),
          student.getFirstName(),
          student.getFirstName(),
          student.getAddress()
        );
    }

    public static Student mapTOStudent(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getAddress()
        );
    }

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateStudentFromStudentDto(StudentDto studentDto, @MappingTarget Student student);
}
