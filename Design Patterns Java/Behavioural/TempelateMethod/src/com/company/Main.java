package com.company;

public class Main {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        tea.prepare();
        System.out.println("------------------------------------------");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepare();
    }
}
