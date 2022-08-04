package com.crowdfunding.be.types;

public enum UserType {
    Staff("Staff"),
    Admin("Admin"),
    Investor("Investor"),
    Entrepreneur("Entrepreneur");

    private String name;

    UserType(String text) {
        this.name = text;
    }

    public String getName() {
        return name;
    }
}
