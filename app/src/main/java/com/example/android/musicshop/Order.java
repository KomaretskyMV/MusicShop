package com.example.android.musicshop;

public class Order {
    private String userName;
    private String goodsName;
    private int quantity;
    private double orderPrice;
    private double price;

    Order(String userName, String goodsName, int quantity, double orderPrice) {
        this.userName = userName;
        this.goodsName = goodsName;
        this.quantity = quantity;
        this.orderPrice = orderPrice;
    }

    public String getUserName() {
        return userName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
