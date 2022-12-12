package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.variable = "heyhey;
        obj.setVariable("heyheyhey");
        System.out.println(obj.getVariable());
    }
}




