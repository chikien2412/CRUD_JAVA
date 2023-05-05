package com.example.demo_crud.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// du lieu hien thi cho ngươi dùng
public class StudentDto {
    private String name;
    private String age;
    private Integer id;
}
