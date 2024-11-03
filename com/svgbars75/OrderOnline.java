package com.svgbars75;

public class OrderOnline {
    public static void main(String[] args) {
        byte order;// объявляем переменные
        String product;
        float price;
        short address;
        order = 1;
        product = "smartphone";
        price = 305.99f;
        address = 10;
        System.out.println("Order № " + order + " Client: Alice.");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: Moon Street, " + address + ".");
        order = 2;
        product = "laptop";
        price = 570.95f;
        address = 17;
        System.out.println("Order № " + order + " Client: Tom.");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: Terra Street, " + address + ".");

        System.out.println("Shop-online for order");

    }
}
