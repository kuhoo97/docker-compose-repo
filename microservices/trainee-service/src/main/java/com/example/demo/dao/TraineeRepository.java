package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Integer>{

}
