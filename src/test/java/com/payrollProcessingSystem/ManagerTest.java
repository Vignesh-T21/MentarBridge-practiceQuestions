package com.payrollProcessingSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ManagerTest {
    private Manager manager;

    @BeforeEach
    void setUp() {
        manager = new Manager("Vignesh", "EMP103", 5000, 800, 300, 1000
        );
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(7100, manager.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(852, manager.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(6248, manager.calculateNetSalary());
    }

    @Test
    void shouldCreateManagerSuccessfully() {
        assertNotNull(manager);
    }

    @Test
    void netSalaryShouldBeLessThanGrossSalary() {
        assertTrue(manager.calculateNetSalary()< manager.calculateGrossSalary()
        );
    }
}

