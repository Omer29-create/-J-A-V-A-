package org.advanceJava.ch02.persistence.service;

import org.advanceJava.ch02.persistence.dao.AbstractDao;
import org.advanceJava.ch02.persistence.dao.EmployeeDao;
import org.advanceJava.ch02.persistence.domain.Employee;

public class EmployeeService {

    private AbstractDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public void createEmployee(Employee employee){
        employeeDao.save(employee);
    }

    public void changePassword(Employee employee, String newPassword){
        employee.setPassword(newPassword);
        employeeDao.update(employee);
    }
}
