package com.update.data.employee.dao;

import com.update.app.model.employee.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee getEmployeeByNo(String employeeNo);
    boolean updateEmployee(Employee employee);
}
