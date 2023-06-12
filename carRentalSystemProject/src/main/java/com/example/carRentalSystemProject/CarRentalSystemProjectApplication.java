package com.example.carRentalSystemProject;

import com.example.carRentalSystemProject.model.Car;
import com.example.carRentalSystemProject.model.CarType;
import com.example.carRentalSystemProject.model.Customer;
import com.example.carRentalSystemProject.repository.CarRepository;
import com.example.carRentalSystemProject.repository.CarTypeRepository;
import com.example.carRentalSystemProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalSystemProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalSystemProjectApplication.class, args);
	}
@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private CarTypeRepository carTypeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Customer adam = new Customer("Ephrem","Kidane","202-344","1234");
//		Customer john = new Customer("John","Smith","508-344","11133");
//		Customer suzan = new Customer("Carrot","Eye","510-234","1234");
//		Customer tim = new Customer("Timoty","Apple","800-223","1234");
//		customerRepository.save(adam);
//		customerRepository.save(adam);
//		customerRepository.save(suzan);
//		customerRepository.save(tim);
//
		CarType toyota = new CarType("Toyata","XLE","RED","2021");
		CarType bmw = new CarType("BMW","i5","black","2022");
		CarType tesla = new CarType("Tesla","dual3","white","2023");

		Car car1 = new Car("yes",toyota);
		Car car2 = new Car("NO",bmw);

		Car car3 = new Car("YES",tesla);

		Car car4 = new Car("YES",toyota);

		Car car5 = new Car("YES",bmw);
		Car car6 = new Car("NO",tesla);
		carTypeRepository.save(toyota);
		carTypeRepository.save(bmw);
		carTypeRepository.save(tesla);

		carRepository.save(car1);
		carRepository.save(car2);
		carRepository.save(car3);
		carRepository.save(car4);
		carRepository.save(car5);
		carRepository.save(car6);




	}
}
