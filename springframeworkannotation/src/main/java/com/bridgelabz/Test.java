package com.bridgelabz;

public class Test {
	private int x;
	private int y;
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("constructor --int:int");
	}
	public Test(double x, double y) {
		this.x = (int)x;
		this.y =(int)y;
		System.out.println("constructor --double:double");
	}
	/*(public Test(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("constructor --int:int");
	}*/
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
	public void add() {
		System.out.println("value of x" +this.x);
		System.out.println("value of x" +this.y);
		System.out.println("result"+(x+y));
	}
}
