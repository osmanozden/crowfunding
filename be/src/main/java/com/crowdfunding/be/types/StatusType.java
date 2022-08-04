package com.crowdfunding.be.types;

public enum StatusType {
    Pending("Pending"),
    Active("Active"),
    Inactive("Inactive"),
    Rejected("Rejected");

    private String name;

    StatusType(String text) {
        this.name = text;
    }

    public String getName() {
        return name;
    }
}
