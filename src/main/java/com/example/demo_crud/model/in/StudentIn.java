package com.example.demo_crud.model.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentIn {
    private String name;
    private String age;
    private Integer id;
}
