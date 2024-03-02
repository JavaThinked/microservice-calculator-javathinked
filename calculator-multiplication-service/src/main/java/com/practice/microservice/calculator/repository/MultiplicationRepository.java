package com.practice.microservice.calculator.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.microservice.calculator.service.model.Result;

@Repository
public interface  MultiplicationRepository extends JpaRepository<Result, Long> {

    List<Result> findByOperation(String operation);
}
