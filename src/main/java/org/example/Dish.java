package org.example;

public class Dish {

    private String dishid;
    public String restroid;
    public int price;
    public String dishName;
    public Dish(String restroid, String dishid, String dishName, Integer price) {
        this.restroid= restroid;
        this.dishid =dishid;
        this.dishName = dishName;
        this.price =price;
    }

    public String getrestroid() {
        return restroid;
    }

    public void setrestroid(String restroid) {
        this.restroid = restroid;
    }

    public String getdishid() {
        return dishid;
    }

    public void setDishid(String dishid) {
        this.dishid = dishid;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
