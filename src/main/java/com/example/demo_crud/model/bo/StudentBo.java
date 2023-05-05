package com.example.demo_crud.model.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// tra ve cho nguoi dung dang json
public class StudentBo {
    private String message;
    private Object studentType;


}
