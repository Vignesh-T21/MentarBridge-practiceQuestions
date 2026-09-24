package com.payrollProcessingSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermanentEmployeeTest {

    private PermanentEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new PermanentEmployee("Arun", "EMP101", 3000,
                500, 200);
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(3700, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(370, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(3330, employee.calculateNetSalary());
    }

    @Test
    void shouldCreateEmployeeSuccessfully() {
        assertNotNull(employee);
    }

    @Test
    void netSalaryShouldBeLessThanGrossSalary() {
        assertTrue(
                employee.calculateNetSalary() < employee.calculateGrossSalary()
        );
    }
}

