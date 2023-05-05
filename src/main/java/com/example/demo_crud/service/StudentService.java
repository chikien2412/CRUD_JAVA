package com.example.demo_crud.service;

import com.example.demo_crud.model.bo.StudentBo;
import com.example.demo_crud.model.in.StudentIn;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentBo get();
    StudentBo create(StudentIn studentIn);

    StudentBo delete(Integer Id);

    StudentBo update(Integer Id, StudentIn studentIn);

}
