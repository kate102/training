package com.deloitte.training.demo3.model;

public class Holiday3 {
    private String destination;
    private int days;

    public Holiday3() {
    }

    public Holiday3(final String destination, final int days) {
        this.destination = destination;
        this.days = days;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(final String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(final int days) {
        this.days = days;
    }

    public Holiday3 destination(final String destination) {
        this.destination = destination;
        return this;
    }

    public Holiday3 days(final int days) {
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
