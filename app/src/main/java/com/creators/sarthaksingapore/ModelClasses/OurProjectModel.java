package com.creators.sarthaksingapore.ModelClasses;

public class OurProjectModel {

    String name,address,bhk;
    int image;

    public OurProjectModel(String name, String address, String bhk, int image) {
        this.name = name;
        this.address = address;
        this.bhk = bhk;
        this.image = image;
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

    public String getBhk() {
        return bhk;
    }

    public void setBhk(String bhk) {
        this.bhk = bhk;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
