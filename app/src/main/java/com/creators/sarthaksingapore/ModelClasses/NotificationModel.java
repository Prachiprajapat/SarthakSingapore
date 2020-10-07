package com.creators.sarthaksingapore.ModelClasses;

public class NotificationModel  {
    String txtTitle,txtDesc,txtTimeAgo;
    int image;

    public NotificationModel(String txtTitle, String txtDesc, String txtTimeAgo, int image) {
        this.txtTitle = txtTitle;
        this.txtDesc = txtDesc;
        this.txtTimeAgo = txtTimeAgo;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtDesc() {
        return txtDesc;
    }

    public void setTxtDesc(String txtDesc) {
        this.txtDesc = txtDesc;
    }

    public String getTxtTimeAgo() {
        return txtTimeAgo;
    }

    public void setTxtTimeAgo(String txtTimeAgo) {
        this.txtTimeAgo = txtTimeAgo;
    }
}
