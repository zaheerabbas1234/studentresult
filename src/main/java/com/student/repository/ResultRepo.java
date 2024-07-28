package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result,String>{

}
