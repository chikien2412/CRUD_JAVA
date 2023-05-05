package com.example.demo_crud.service;

import com.example.demo_crud.mapper.StudentMapper;
import com.example.demo_crud.model.bo.StudentBo;
import com.example.demo_crud.model.dto.StudentDto;
import com.example.demo_crud.model.entity.StudentEntity;
import com.example.demo_crud.model.in.StudentIn;
import com.example.demo_crud.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentImpl implements StudentService{
    @Autowired
    StudentRespository studentRespository;
    @Override
    public StudentBo get(){
    List<StudentEntity> list = studentRespository.findAll();
        List<StudentDto> listDto =list.stream().map(StudentMapper::mapDTO).collect(Collectors.toList());
    return new StudentBo("data", listDto);
    }

    @Override
    public  StudentBo create(StudentIn studentIn){
        StudentEntity studentEntity = StudentMapper.map(studentIn);
        studentRespository.save(studentEntity);
        return new StudentBo("add success", true);
    }

    @Override
    public StudentBo delete(Integer Id) {
        StudentEntity studentEntity = studentRespository.getById(Id);
        studentRespository.delete(studentEntity);
        return new StudentBo("delete success", true);
    }

    @Override
    public StudentBo update(Integer Id, StudentIn studentIn) {
        StudentEntity studentEntity = studentRespository.getById(Id);
        studentEntity.setAge(studentIn.getAge());
        studentEntity.setName(studentIn.getName());
        studentRespository.save(studentEntity);

        return new StudentBo("update success", true);
    }


}
