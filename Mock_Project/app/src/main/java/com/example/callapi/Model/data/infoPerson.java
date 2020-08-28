package com.example.callapi.Model.data;

public class infoPerson {
    private int Image;
    private int Image2;
    private String text;

    public int getImage2() {
        return Image2;
    }

    public void setImage2(int image2) {
        Image2 = image2;
    }


    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public infoPerson(int image, String text) {
        Image = image;
        this.text = text;
    }

    public infoPerson(int image, String text, int image2) {
        Image = image;
        this.text = text;
        Image2 = image2;
    }
}
