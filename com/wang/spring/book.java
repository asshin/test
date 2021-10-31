package com.wang.spring;

public class book {
    private String name;
    private int price;
     private  String count;

    public book(String name, int price, String count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public book(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count='" + count + '\'' +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
