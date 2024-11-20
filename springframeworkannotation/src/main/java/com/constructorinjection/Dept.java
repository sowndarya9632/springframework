package com.constructorinjection;

public class Dept {
String dName;

public Dept(String dName) {
	this.dName = dName;
}

@Override
public String toString() {
	return "Dept [dName=" + dName + "]";
}

}
