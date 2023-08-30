package net.ems.springboot;

import net.ems.springboot.model.Employee;
import net.ems.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee();
		employee1.setFirstName("John");
		employee1.setLastName("Smith");
		employee1.setEmail("johnsmith@gmail.com");
		employeeRepository.save(employee1);


		Employee employee2 = new Employee();
		employee2.setFirstName("Ray");
		employee2.setLastName("Jones");
		employee2.setEmail("rayjones@gmail.com");
		employeeRepository.save(employee2);


	}
}
