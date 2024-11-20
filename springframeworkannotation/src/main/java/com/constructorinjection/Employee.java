package com.constructorinjection;

public class Employee {
private String eName;
private int eId;
private double eSal;
private Dept dept;
public Employee(String eName, int eId,double eSal,Dept dept) {
	this.eName=eName;
	this.eId = eId;
	this.eSal= eSal;
	this.dept=dept;
}
@Override
public String toString() {
	return "Employee [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + ", dept=" + dept + "]";
}




}
