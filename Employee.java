package com.sadiq.jpa.com.week5;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {

  @Id

  //@GeneratedValue(strategy=GenerationType.AUTO)

  private int empno;
  private String ename;
  private String designation;
  private double salary;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}