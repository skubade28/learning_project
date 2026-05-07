package com.fullstack.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    @NotBlank(message = "Employee Name cannot be blank")
    private String empName;

    @NotBlank(message = "Employee Address cannot be blank")
    private String empAddress;

    @Digits(integer = 10, fraction = 0, message = "Contact number must contain exactly 10 digits")
    @Column(unique = true)
    private Long empContactNumber;

    @Positive(message = "Salary must be greater than 0")
    private double empSalary;

    @NotNull(message = "Date of birth cannot be null")
    @Past(message = "Date of birth must be in the past")
    private LocalDateTime empDOB;

    @Column(unique = true)
    private String empEmailId;

    private String empPassword;
}
