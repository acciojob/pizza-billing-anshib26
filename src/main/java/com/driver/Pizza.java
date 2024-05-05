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
    private int basePrice = 0;
    private final int cheesePrice = 80;
    private int toppingPrice;
    private final int takeawayPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price = 300;
            basePrice = 300;
            toppingPrice = 70;
        }
        else{
            price = 400;
            basePrice = 400;
            toppingPrice = 120;
        }
    }

    public int getPrice(){
        return price;
    }

    //public void setPrice(int amount){ this.price+=amount; }

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
        bill = "Base Price Of The Pizza: " + basePrice;
        if(cheeseFlag==1){bill += "\nExtra Cheese Added: " + cheesePrice; price+=cheesePrice;}
        if(toppingFlag==1){bill += "\nExtra Toppings Added: " + toppingPrice; price+=toppingPrice;}
        if(takeawayFlag==1){bill += "\nPaperbag Added: " + takeawayPrice; price+=takeawayPrice;}
        bill += "\nTotal Price: " + getPrice() + "\n";
        return this.bill;
    }
}
