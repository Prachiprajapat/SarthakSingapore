package com.creators.sarthaksingapore.ModelClasses;

public class SeeProjectModel {

    String price,bhk,name,address,status;
    int image;

    public SeeProjectModel(String price, String bhk, String name, String address, String status, int image) {
        this.price = price;
        this.bhk = bhk;
        this.name = name;
        this.address = address;
        this.status = status;
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBhk() {
        return bhk;
    }

    public void setBhk(String bhk) {
        this.bhk = bhk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
