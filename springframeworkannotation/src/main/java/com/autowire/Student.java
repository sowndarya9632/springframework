package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	/*@Autowired
	 * 
	 */
private Certificate certi;

/*public Student() {
	
}*/

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
