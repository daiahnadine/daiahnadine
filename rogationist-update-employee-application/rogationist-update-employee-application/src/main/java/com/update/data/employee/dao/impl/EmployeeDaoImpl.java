package com.update.data.employee.dao.impl;

import com.update.data.connection.ConnectionHelper;
import com.update.data.employee.dao.EmployeeDao;
import com.update.app.model.employee.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {


    @Override
    public Employee getEmployeeByNo(String employeeNo)  {
        try{
            Connection connection;
            connection = new ConnectionHelper().getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from Employee");
            statement.setString(1,employeeNo);
            ResultSet result = statement.executeQuery();

            if (result.next()){
                return setEmployee(result);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }
    @Override
    public boolean updateEmployee(Employee employee)  {
        try  {
            Connection connection;
            connection = new ConnectionHelper().getConnection(ADD_EMPLOYEE_STATEMENT));
            PreparedStatement statement;
            statement = connection.prepareStatement();
            statement.setString(1, employee.getLastName());
            statement.setString(2, employee.getFirstName());
            statement.setString(3, employee.getMiddleName());
            statement.setString(4, employee.getPositionInRC());
            statement.setString(5, employee.getDateEmployed());
            statement.setString(6, employee.getBirthDate());
            statement.setString(7, employee.getBirthPlace());
            statement.setString(8, employee.getSex());
            statement.setString(9, employee.getCivilStatus());
            statement.setString(10, employee.getCitizenship());
            statement.setString(11, employee.getReligion());
            statement.setDouble(12, employee.getHeight());
            statement.setDouble(13, employee.getWeight());
            statement.setString(14, employee.getEmail());
            statement.setString(15, employee.getSssNo());
            statement.setString(16, employee.getTinNo());
            statement.setString(17, employee.getPagibigNo());
            statement.setString(18, employee.getEmployeeNo());
            int result = statement.executeUpdate();

            return result == 1? true: false;
        } catch (Exception e) {

        }
        return true;
    }

    private Employee setEmployee(ResultSet result) {
        try{
            Employee employee = new Employee();
            employee = new Employee();
            employee.setLastName(result.getString("LAST_NAME"));
            employee.setFirstName(result.getString("FIRST_NAME"));
            employee.setMiddleName(result.getString("MIDDLE_NAME"));
            employee.setPositionInRC(result.getString("POSITION_IN_RC"));
            employee.setBirthDate(result.getString("BIRTHDATE"));
            employee.setBirthPlace(result.getString("BIRTHPLACE"));
            employee.setSex(result.getString("SEX"));
            employee.setCivilStatus(result.getString("CIVIL_STATUS"));
            employee.setCitizenship(result.getString("CITIZENSHIP"));
            employee.setReligion(result.getString("RELIGION"));
            employee.setHeight(result.getDouble("HEIGHT"));
            employee.setWeight(result.getDouble("WEIGHT"));
            employee.setEmail(result.getString("EMAIL"));
            employee.setSssNo(result.getString("SSS_NO"));
            employee.setTinNo(result.getString("TIN_NO"));
            employee.setPagibigNo(result.getString("PAGIBIG_NO"));
            employee.setEmployeeNo(result.getString("EMPLOYEE_NO"));
            return employee;
        } catch (Exception e) {
        }
        return null;
    }
}