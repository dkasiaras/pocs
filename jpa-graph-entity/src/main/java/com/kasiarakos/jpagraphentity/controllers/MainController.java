package com.kasiarakos.jpagraphentity.controllers;

import com.kasiarakos.jpagraphentity.entities.Employee;
import com.kasiarakos.jpagraphentity.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class MainController {

    private final EmployeeRepository employeeRepository;

    @GetMapping
    public Employee getEmployee() {
        return this.employeeRepository.findByIdAndIdNotNull("1").orElse(null);
    }
}
