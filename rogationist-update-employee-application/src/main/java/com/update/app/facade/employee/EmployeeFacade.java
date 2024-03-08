//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.update.app.facade.employee;

import com.update.app.model.employee.Employee;

public interface EmployeeFacade {
    Employee getEmployeeByNo(String employeeNo);

    boolean updateEmployee(Employee employee);
}
