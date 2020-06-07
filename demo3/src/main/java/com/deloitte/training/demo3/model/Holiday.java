package com.deloitte.training.demo3.model;

public class Holiday {
    private String destination;
    private int days;

    public Holiday() {
    }

    public Holiday(String destination, int days) {
        this.destination = destination;
        this.days = days;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Holiday destination(String destination) {
        this.destination = destination;
        return this;
    }

    public Holiday days(int days) {
        this.days = days;
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " destination='" + getDestination() + "'" +
            ", days='" + getDays() + "'" +
            "}";
    }
}
