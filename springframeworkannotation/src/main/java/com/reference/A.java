package com.reference;

public class A {
	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}

	private int x;
	private B b;

	/*A() {

	}*/

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		System.out.println("uses");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("uses");
	}
}
