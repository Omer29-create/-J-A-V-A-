package org.advanceJava.ch01.factory;

public class TestPayrollOffice {

    public static void main(String[] args) {
        PayrollOffice payrollOffice = new PayrollOffice();

        Employee e1 = new Employee(1, "Ali", 8, "production");
        payrollOffice.paySalary(e1);
    }
}
