package com.annotation;

public class Pizzza {
	private Pespi p;
	void deliver() {
		p.drink();
		System.out.println("deliver");
	}
	

	@Override
	public String toString() {
		return "Pizzza [p=" + p + "]";
	}


	public Pespi getP() {
		return p;
	}


	public void setP(Pespi p) {
		this.p = p;
	}


	public Pizzza(Pespi p) {
		this.p=p;
		
	}

}
