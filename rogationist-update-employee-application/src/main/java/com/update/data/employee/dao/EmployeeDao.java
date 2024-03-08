//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.update.data.employee.dao;

import com.update.app.model.employee.Employee;

public interface EmployeeDao {
    Employee getEmployeeByNo(String employeeNo);

    boolean updateEmployee(Employee employeeNo);
}
