package com.example.employee1.Employee1.Repo;

import com.example.employee1.Employee1.DTO.EmployeeDTO;
import com.example.employee1.Employee1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpRepo extends JpaRepository<Employee,Integer>
{
    List<Employee> findByName(String name);
}
