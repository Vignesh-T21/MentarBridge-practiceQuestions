package com.payrollProcessingSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new ContractEmployee("Eswar", "EMP102", 3000, 400
        );
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(3400, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(170, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(3230, employee.calculateNetSalary());
    }

    @Test
    void shouldCreateEmployeeSuccessfully() {
        assertNotNull(employee);
    }

    @Test
    void netSalaryShouldBeLessThanGrossSalary() {
        assertTrue(employee.calculateNetSalary() < employee.calculateGrossSalary());
    }
}

