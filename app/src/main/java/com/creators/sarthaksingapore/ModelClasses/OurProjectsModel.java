package com.creators.sarthaksingapore.ModelClasses;

public class OurProjectsModel {
    public   int  PropertiesImage ;
    public   String propertiesPrice;
    public  String Propertiestype;
    public  String Propertiesaddress;
    public  String Propertiestime;

    public OurProjectsModel(int propertiesImage, String propertiesPrice, String propertiestype, String propertiesaddress, String propertiestime) {
        PropertiesImage = propertiesImage;
        this.propertiesPrice = propertiesPrice;
        Propertiestype = propertiestype;
        Propertiesaddress = propertiesaddress;
        Propertiestime = propertiestime;

    }


    public int getPropertiesImage() {
        return PropertiesImage;
    }

    public String getPropertiesPrice() {
        return propertiesPrice;
    }

    public String getPropertiestype() {
        return Propertiestype;
    }

    public String getPropertiesaddress() {
        return Propertiesaddress;
    }

    public String getPropertiestime() {
        return Propertiestime;
    }

}
