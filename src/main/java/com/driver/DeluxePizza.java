package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(isVeg){
            setPrice(150);
        }
        else{
            setPrice(200);
        }
    }
}
