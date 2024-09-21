package com.balar.practiceFullStack.springBootAngularBackend.repository;

import com.balar.practiceFullStack.springBootAngularBackend.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {
}
