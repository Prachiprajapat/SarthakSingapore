package com.creators.sarthaksingapore.ModelClasses;

public class SavedModel {
    String price,size,name,address;
    int image;

    public SavedModel(String price, String size, String name, String address, int image) {
        this.price = price;
        this.size = size;
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
