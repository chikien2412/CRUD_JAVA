package com.example.demo_crud.mapper;

import com.example.demo_crud.model.dto.StudentDto;
import com.example.demo_crud.model.entity.StudentEntity;
import com.example.demo_crud.model.in.StudentIn;

public class StudentMapper {
    public static StudentEntity map(StudentIn studentIn){
            StudentEntity studentEntity =new StudentEntity();
            studentEntity.setName(studentIn.getName());
            studentEntity.setAge(studentIn.getAge());
            studentEntity.setId(studentIn.getId());
            return studentEntity;
    }
    public static StudentDto mapDTO(StudentEntity studentEntity){
        StudentDto studentDto =new StudentDto();
        studentDto.setName(studentEntity.getName());
        studentDto.setAge(studentEntity.getAge());
        studentDto.setId(studentEntity.getId());
        return studentDto;
    }
}
