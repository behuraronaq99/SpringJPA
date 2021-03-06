package com.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
