package com.eb;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.eb.model.Address;
import com.eb.model.Employee;
import com.eb.repository.AddressRepository;
import com.eb.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OneToOneMappingApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		AddressRepository addressRepository = context.getBean(AddressRepository.class);
		// Save into db
		Address address = new Address();
		address.setZipCode("425201");
		address.setCountry("USA");
		address.setState("Newyork");
		Employee employee = new Employee();
		employee.setEmpName("Nicolas");
		employee.setAddress(address);
		employeeRepository.save(employee);
		List<Employee> list = employeeRepository.findAll();
		System.out.println(list);
		Address addresses = addressRepository.findByZipCode("425201");
		System.out.println(addresses);
		}
		}

