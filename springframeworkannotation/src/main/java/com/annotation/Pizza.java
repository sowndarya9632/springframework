package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("firstpizza")
public class Pizza {
    @Value("pizza")
    private String pName;

    @Value("100")
    private double pPrice;

    @Value("#{T(com.annotation.PizzaConfig).a}")
    private List<String> list;

    void delivery() {
        System.out.println("Delivered");
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    @Override
    public String toString() {
        return "Pizza [pName=" + pName + ", pPrice=" + pPrice + ", list=" + list + "]";
    }

    public Pizza() {
        super();
    }
}
