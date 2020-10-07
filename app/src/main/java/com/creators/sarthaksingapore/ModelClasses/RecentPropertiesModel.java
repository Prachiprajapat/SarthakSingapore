package com.creators.sarthaksingapore.ModelClasses;

public class RecentPropertiesModel {

    public int Property_image;
    public String property_price;
    public String property_status;
    public String property_type;
    public String property_adress;
    public String property_size;

    public int getProperty_image() {
        return Property_image;
    }

    public String getProperty_price() {
        return property_price;
    }

    public String getProperty_status() {
        return property_status;
    }

    public String getProperty_type() {
        return property_type;
    }

    public String getProperty_adress() {
        return property_adress;
    }

    public String getProperty_quality() {
        return property_quality;
    }

    public String getProperty_size() {
        return property_size;
    }

    public String property_quality;
    public RecentPropertiesModel(int property_image, String property_price, String property_status, String property_type, String property_adress, String property_quality,String property_size) {
        Property_image = property_image;
        this.property_price = property_price;
        this.property_status = property_status;
        this.property_type = property_type;
        this.property_adress = property_adress;
        this.property_quality = property_quality;
        this.property_size = property_size;
    }





}
