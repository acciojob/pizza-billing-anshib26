package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean hasExtraCheese;
    private Boolean hasExtraToppings;

    private int cheeseFlag = 0;
    private int toppingFlag = 0;
    private int takeawayFlag = 0;
    private final int cheesePrice = 80;
    private int toppingPrice;
    private final int takeawayPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            toppingPrice = 70;
        }
        else{
            this.price = 400;
            toppingPrice = 120;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int amount){ this.price+=amount; }

    public void addExtraCheese(){
        cheeseFlag = 1;
    }

    public void addExtraToppings(){
        toppingFlag = 1;
    }

    public void addTakeaway(){
        takeawayFlag = 1;
    }

    public String getBill(){
        bill = "Base Price Of The Pizza: " + getPrice();
        if(cheeseFlag==1){bill += "\nExtra Cheese Added: " + cheesePrice; setPrice(cheesePrice);}
        if(toppingFlag==1){bill += "\nExtra Toppings Added: " + toppingPrice; setPrice(toppingPrice);}
        if(takeawayFlag==1){bill += "\nPaperbag Added: " + takeawayPrice; setPrice(takeawayPrice);}
        bill += "\nTotal Price: " + getPrice() + "\n";
        return this.bill;
    }
}
