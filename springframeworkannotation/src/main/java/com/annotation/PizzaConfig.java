package com.annotation;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annotation")
public class PizzaConfig {
    public static final List<String> a = Arrays.asList("pizza", "pp", "ss");
	
}
