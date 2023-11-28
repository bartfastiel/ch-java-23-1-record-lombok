package org.example;

public enum Subject {

    MATH, IT, GERMAN, GEOGRAPHICS

    ;

    private String credits;

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
}
