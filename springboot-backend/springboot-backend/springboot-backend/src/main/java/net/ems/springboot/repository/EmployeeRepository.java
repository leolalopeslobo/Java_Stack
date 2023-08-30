package net.ems.springboot.repository;

import net.ems.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { //Employee JPA Type and datatype of the Primary Key
    //All CRUD database methods to interact with the database
}
