package com.example.kriptonx;

import java.io.Serializable;

public class ScanModel implements Serializable {

    String id,description,date,center, img_url;

    public ScanModel() {
    }

    public ScanModel(String id, String description, String date, String center,String img_url ) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.center = center;
        this.img_url = img_url;
    }

    @Override
    public String toString() {
        return "ScanModel{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", center='" + center + '\'' +
                ", img_url='" + img_url + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
