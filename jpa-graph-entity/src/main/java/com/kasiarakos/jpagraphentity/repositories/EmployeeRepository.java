package com.kasiarakos.jpagraphentity.repositories;

import com.kasiarakos.jpagraphentity.entities.Employee;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @EntityGraph(value = "employee.complete", type = EntityGraph.EntityGraphType.FETCH)
    Optional<Employee> findByIdAndIdNotNull(String id);
}
