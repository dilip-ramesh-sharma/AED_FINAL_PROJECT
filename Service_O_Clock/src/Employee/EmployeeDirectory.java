/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> empList;

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    public Employee createEmployee(String name){
        Employee e = new Employee();
        e.setEmpName(name);
        empList.add(e);
        return e;
    }
    
}
