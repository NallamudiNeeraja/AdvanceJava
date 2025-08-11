package com.pack1;

import java.io.Serializable;

public class EmpBean implements Serializable
{
private String eid;
private String empFirstName;
private String empLastName;
private int empSalary;
private String empAddress;
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEmpFirstName() {
	return empFirstName;
}
public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}
public String getEmpLastName() {
	return empLastName;
}
public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int i) {
	this.empSalary = i;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public  EmpBean() {
}
}

