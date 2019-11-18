package com;

import java.util.Objects;

public class Employee {
    int empid;
    String empName;

    public Employee(){

    }
    public Employee(int empid, String empName) {
        this.empid = empid;
        this.empName = empName;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empid == employee.empid &&
                Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, empName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                '}';
    }
}
