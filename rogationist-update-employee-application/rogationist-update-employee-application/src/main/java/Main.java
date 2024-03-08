

import com.update.app.facade.employee.EmployeeFacade;
import com.update.app.facade.employee.impl.EmployeeFacadeImpl;
import com.update.app.model.employee.Employee;
import com.update.data.employee.dao.EmployeeDao;
import com.update.data.employee.dao.impl.EmployeeDaoImpl;
import com.update.data.utils.QueryConstant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacadeImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Searching Employee Id");
        System.out.print("Enter employee no: ");
        String employeeNo = sc.nextLine();

        Employee uEmployees = employeeFacade.getEmployeeByNo(employeeNo);

        if (uEmployees == null) {
            System.out.println("Employee not found");
            return;
        }


        uEmployees.updateEmployeeNo(employeeNo);

        System.out.println("LASTNAME: " + uEmployees.getLastName());
        System.out.println("FIRSTNAME: " + uEmployees.getFirstName());
        System.out.println("MIDDLENAME: " + uEmployees.getMiddleName());
        System.out.println("POSITION IN RC: " + uEmployees.getPositionInRC());
        System.out.println("DATE EMPLOYED: " + uEmployees.getDateEmployed());
        System.out.println("BIRTHDATE: " + uEmployees.getBirthDate());
        System.out.println("BIRTHPLACE: " + uEmployees.getBirthPlace());
        System.out.println("SEX: " + uEmployees.getSex());
        System.out.println("CIVIL STATUS: " + uEmployees.getCivilStatus());
        System.out.println("CITIZENSHIP: " + uEmployees.getCitizenship());
        System.out.println("RELIGION: " + uEmployees.getReligion());
        System.out.println("HEIGHT: " + uEmployees.getHeight());
        System.out.println("WEIGHT: " + uEmployees.getWeight());
        System.out.println("EMAIL: " + uEmployees.getEmail());
        System.out.println("SSS NO: " + uEmployees.getSssNo());
        System.out.println("TIN NO: " + uEmployees.getTinNo());
        System.out.println("PAGIBIG NO: " + uEmployees.getPagibigNo());
        System.out.println("EMPLOYEE NO: " + uEmployees.getEmployeeNo());

        System.out.println("Updating");
        System.out.println("Update lastname");
        uEmployees.setLastName(sc.nextLine());
        System.out.println("Update firstname");
        uEmployees.setFirstName(sc.nextLine());
        System.out.println("Update middlename");
        uEmployees.setMiddleName(sc.nextLine());
        System.out.println("Update position in RC");
        uEmployees.setPositionInRC(sc.nextLine());
        System.out.println("Update date employed");
        uEmployees.setDateEmployed(sc.nextLine());
        System.out.println("Update birthdate");
        uEmployees.setBirthDate(sc.nextLine());
        System.out.println("Update birthplace");
        uEmployees.setBirthPlace(sc.nextLine());
        System.out.println("Update sex");
        uEmployees.setSex(sc.nextLine());
        System.out.println("Update civil status");
        uEmployees.setCivilStatus(sc.nextLine());
        System.out.println("Update citizenship");
        uEmployees.setCitizenship(sc.nextLine());
        System.out.println("Update religion");
        uEmployees.setReligion(sc.nextLine());
        System.out.println("Update height");
        uEmployees.setHeight(sc.nextDouble());
        System.out.println("Update weight");
        uEmployees.setWeight(sc.nextDouble());
        System.out.println("Update email");
        sc.nextLine(); // Consume newline
        uEmployees.setEmail(sc.nextLine());
        System.out.println("Update SSS NO");
        uEmployees.setSssNo(sc.nextLine());
        System.out.println("Update TIN NO");
        uEmployees.setTinNo(sc.nextLine());
        System.out.println("Update PAGIBIG NO");
        uEmployees.setPagibigNo(sc.nextLine());
        System.out.println("Update Employee No");
        uEmployees.setEmployeeNo(sc.nextLine());

        try {
            employeeFacade.updateEmployee(uEmployees);
            System.out.println("Successfully updated.");
        } catch (Exception e) {
            System.out.println("Error updating: " + e.getMessage());
        }
    }
}
