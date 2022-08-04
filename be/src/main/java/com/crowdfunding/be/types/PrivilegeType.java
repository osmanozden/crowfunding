package com.crowdfunding.be.types;

import lombok.Getter;

@Getter
public enum PrivilegeType {
    READ("READ"),
    DELETE("DELETE"),
    UPDATE("UPDATE"),
    CREATE("CREATE"),
    APPROVE("APPROVE");

    private String name;

    PrivilegeType(String text) {
        this.name = text;
    }

    public String getName() {
        return name;
    }
}
