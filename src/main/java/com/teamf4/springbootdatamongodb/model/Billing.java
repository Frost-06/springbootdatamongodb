package com.teamf4.springbootdatamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "billing")
public class Billing {
    @Id
    private String billingID;
    private int menu;
    private String description;
    private double price;

    public Billing(String billingID, int menu, String description, double price) {
        this.billingID = billingID;
        this.menu = menu;
        this.description = description;
        this.price = price;
    }

    public String getBillingID() {
        return this.billingID;
    }

    public void setBillingID(String billingID) {
        this.billingID = billingID;
    }

    public int getMenu() {
        return this.menu;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
