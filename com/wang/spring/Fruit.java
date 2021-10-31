package com.wang.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Fruit {
   private String []name;
   private List<Integer> price;
   private Map map;

    @Override
    public String toString() {
        return "Fruit{" +
                "name=" + Arrays.toString(name) +
                ", price=" + price +
                ", map=" + map +
                '}';
    }

    public List<Integer> getPrice() {
        return price;
    }

    public void setPrice(List<Integer> price) {
        this.price = price;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }




    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
