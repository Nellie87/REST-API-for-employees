package com.example.employeesfill.repository;



import com.example.employeesfill.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // You can add custom query methods here if needed
    // For example:
    // Optional<Employee> findByEmail(String email);
}