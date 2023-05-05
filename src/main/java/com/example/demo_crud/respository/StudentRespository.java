package com.example.demo_crud.respository;

import com.example.demo_crud.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRespository extends JpaRepository<StudentEntity, Integer> {
    StudentEntity getById(Integer Id);

}
