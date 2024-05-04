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
    private int cheesePrice;
    private int toppingPrice;
    private int takeawayPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int amount){ this.price+=amount; }

    public void addExtraCheese(){
        cheeseFlag = 1;
        cheesePrice = 80;
    }

    public void addExtraToppings(){
        toppingFlag = 1;
        if(isVeg){
            toppingPrice = 70;
        }
        else{
            toppingPrice = 120;
        }
    }

    public void addTakeaway(){
        takeawayFlag = 1;
        takeawayPrice = 20;
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
