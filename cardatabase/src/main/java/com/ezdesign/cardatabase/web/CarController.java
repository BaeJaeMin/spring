package com.ezdesign.cardatabase.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezdesign.cardatabase.domain.Car;
import com.ezdesign.cardatabase.domain.CarRepository;

@RestController
public class CarController {
	@Autowired
	private CarRepository repository;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/cars")	
	public Iterable<Car>getCars() {
		return repository.findAll();
		//Fetch and return cars
		}
	
}
