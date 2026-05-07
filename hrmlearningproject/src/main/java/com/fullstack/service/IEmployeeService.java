package com.fullstack.service;

import com.fullstack.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Employee signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);

    List<Employee> saveAll(List<Employee> employees);

    Optional<Employee> findById(long empId);

    List<Employee> findAll();

    Employee updateById(long empId,Employee employee);

    void deleteById(long empId);

    void deleteAll();




}
