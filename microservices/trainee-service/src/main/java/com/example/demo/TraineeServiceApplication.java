package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.dao.TraineeRepository;
import com.example.demo.model.Trainee;

@SpringBootApplication
@EnableEurekaClient
public class TraineeServiceApplication implements CommandLineRunner {

	public TraineeRepository traineeRepository;
	
	
	@Autowired
	public TraineeServiceApplication(TraineeRepository traineeRepository) {
	
		this.traineeRepository = traineeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TraineeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		traineeRepository.save(new Trainee("Pooja"));
		traineeRepository.save(new Trainee("Indraja"));
		traineeRepository.save(new Trainee("Aakansha"));
		traineeRepository.save(new Trainee("Veeraveni"));
	}

}
