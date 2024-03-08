//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.update.app.facade.employee.impl;

import com.update.app.facade.employee.EmployeeFacade;
import com.update.app.model.employee.Employee;
import com.update.data.employee.dao.EmployeeDao;
import com.update.data.employee.dao.impl.EmployeeDaoImpl;

public class EmployeeFacadeImpl implements EmployeeFacade {
    private final EmployeeDao employeeDao = new EmployeeDaoImpl();

    public EmployeeFacadeImpl() {
    }

    public Employee getEmployeeByNo(String employeeNo) {
        return this.employeeDao.getEmployeeByNo(employeeNo);
    }

    public boolean updateEmployee(Employee employee) {
        return this.employeeDao.updateEmployee(employee);
    }
}
