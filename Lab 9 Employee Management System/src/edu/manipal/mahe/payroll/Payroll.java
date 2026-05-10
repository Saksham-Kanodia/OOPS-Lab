package edu.manipal.mahe.payroll;
//System.out.println("");
import edu.manipal.mahe.department.*;
import edu.manipal.mahe.employee.*;


public class Payroll {
    private Employee employee = new Employee(101, "Saksham Kanodia", 20, 50000.0);
    private Department department = new Department("Research and Development", "Sundar Pichai", "Silicon Valley");

    private double calculateNetSalary(){
        double DA = 0.52* employee.basicSalary;
        double GrossSalary= employee.basicSalary + DA;
        double IT = 0.30 * GrossSalary;
        return (GrossSalary-IT);
    }

    public void generatePaySlip(){
        System.out.println("Payslip for Jan 2025");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.age());
        System.out.println();
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Net Salary: "+ calculateNetSalary());
    }
}
