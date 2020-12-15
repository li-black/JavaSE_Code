package com.Work;

//phone类
public class Phone {
    private String name;
    private String brand;
    private int price;

    public Phone() {

    }

    public Phone(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void show() {
        System.out.println(name + "..." + brand + "..." + price);
    }
}
