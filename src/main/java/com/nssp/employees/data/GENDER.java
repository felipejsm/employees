package com.nssp.employees.data;

public enum GENDER {
    MALE("M"),
    FEMALE("F"),
    NON_BINARY("NB"),
    TRANS("T"),
    OTHER("O");

    private String value;

    GENDER(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
