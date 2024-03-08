package com.update.app.facade.employee.impl;

import com.update.app.facade.employee.EmployeeFacade;
import com.update.app.model.employee.Employee;
import com.update.data.employee.dao.EmployeeDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class StudentFacadeImplTest {
    private EmployeeFacade employeeFacade;

    @BeforeEach
    public void setUp() {
        employeeFacade = new EmployeeFacadeImpl();
    }

    @Test
    public void testGetEmployeeById() {
        Employee expectedEmployee = new Employee();
        expectedEmployee.setLastName("DELOS REYES");
        expectedEmployee.setFirstName("AIAH NADINE");
        expectedEmployee.setMiddleName("QUINONES");
        expectedEmployee.setDateEmployed("AUGUST 15, 2021");
        expectedEmployee.setBirthDate("DECEMBER 16, 2002");
        expectedEmployee.setBirthPlace("PASAY CITY");
        expectedEmployee.setSex("FEMALE");
        expectedEmployee.setCivilStatus("SINGLE");
        expectedEmployee.setCitizenship("FILIPINO");
        expectedEmployee.setReligion("CATHOLIC");
        expectedEmployee.setHeight(Double.parseDouble("157"));
        expectedEmployee.setWeight(Double.parseDouble("49"));
        expectedEmployee.setEmail("aiahnadinedelosreyes@gmail.com");
        expectedEmployee.setSssNo("123-456-789");
        expectedEmployee.setTinNo("123-456-7899");
        expectedEmployee.setPagibigNo("123-456-789");
        expectedEmployee.setEmployeeNo("123456789");
    }

    @Test
    public void testUpdateEmployee() {
        Employee existingEmployee = employeeFacade.getEmployeeByNo("123456789");
        existingEmployee.setEmployeeNo("123455789");
        employeeFacade.updateEmployee(existingEmployee);

        Employee updatedEmployee = employeeFacade.getEmployeeByNo("123456789");

        assertEquals("123455789", updatedEmployee.getEmployeeNo());
    }

    @Test
    public void testGetNonexistentEmployee() {
        Employee nonExistentEmployee = employeeFacade.getEmployeeByNo("123456789");
        assertNull(nonExistentEmployee);
    }
}
