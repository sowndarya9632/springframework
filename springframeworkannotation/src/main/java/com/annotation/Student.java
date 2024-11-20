package com.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Qualifier("certi2")
	@Autowired
private Certificate certi;

public Student() {
	
}

public Student(Certificate certi) {
	this.certi = certi;
	System.out.println("injecting using constructor");
}

public Certificate getCerti() {
	return certi;
}

public void setCerti(Certificate certi) {
	this.certi = certi;
}

@Override
public String toString() {
	return "Student [certi=" + certi + "]";
}


}
