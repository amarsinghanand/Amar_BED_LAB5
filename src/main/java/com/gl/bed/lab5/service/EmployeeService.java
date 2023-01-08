package com.gl.bed.lab5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.bed.lab5.model.Employee;

@Service
public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(long id);

	public void save(Employee employee);

	public void deleteById(long id);
}
