package com.gl.bed.lab5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.bed.lab5.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
