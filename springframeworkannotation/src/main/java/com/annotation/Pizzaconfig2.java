package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Pizzaconfig2 {
	@Bean(name= {"a","b"})
	public Pespi getpepsi() {
		return new Pespi();

	}
	@Bean(name= {"d","c"})
	public Pizzza getpizza() {
		return new Pizzza(getpepsi());
	}
}
