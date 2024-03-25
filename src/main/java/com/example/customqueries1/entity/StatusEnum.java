package com.example.customqueries1.entity;

public enum StatusEnum {

    ON_TIME ("On time"),

    DELAYED ("Delayed"),

    CANCELLED ("Cancelled");

    private final String descriptionStatus;

    StatusEnum(String descriptionStatus) {
        this.descriptionStatus = descriptionStatus;
    }

    public String getDescriptionStatus() {
        return descriptionStatus;
    }
}
