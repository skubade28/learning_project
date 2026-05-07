package com.fullstack.service;

import com.fullstack.entity.Employee;
import com.fullstack.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee signUp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {
        return employeeRepository.findByEmpEmailIdAndEmpPassword(empEmailId, empPassword);
    }

    @Override
    public List<Employee> saveAll(List<Employee> employees) {
        return List.of();
    }

    @Override
    public Optional<Employee> findById(long empId) {
        return Optional.empty();
    }

    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee updateById(long empId, Employee employee) {
        return null;
    }

    @Override
    public void deleteById(long empId) {

    }

    @Override
    public void deleteAll() {

    }
}
