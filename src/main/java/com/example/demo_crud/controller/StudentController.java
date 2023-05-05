package com.example.demo_crud.controller;

import com.example.demo_crud.respository.StudentRespository;
import com.example.demo_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
@CrossOrigin()
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("")
    public ResponseEntity<?> get(){return new ResponseEntity<>(studentService.get(), HttpStatus.OK);}


}
