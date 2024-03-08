package com.update.app.facade.employee.impl;

import com.update.app.facade.employee.EmployeeFacade;
import com.update.data.employee.dao.EmployeeDao;
import com.update.app.model.employee.Employee;
import com.update.data.employee.dao.impl.EmployeeDaoImpl;

public class EmployeeFacadeImpl implements EmployeeFacade {
    Employee employeeDao = new Employee();
    @Override
    public Employee getEmployeeByNo(String employeeNo) {
        return employeeDao;
    }
    @Override
    public boolean updateEmployee(Employee employee) {
        boolean result = false;
        try {
            Employee targetEmployee = getEmployeeByNo(employee.getEmployeeNo());
            if (targetEmployee == null) {
                throw new Exception("Student to update not found. ");
            }
            employeeDao.updateEmployee(employee);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }

}
