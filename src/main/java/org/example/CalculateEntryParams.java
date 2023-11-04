package org.example;

public class CalculateEntryParams {
    // class fields salary, rent, food, transport, other
    private double salary;
    private double rent;
    private double food;
    private double transport;
    private double other;

    // class
    public double CalculateEntryParamsEntity(double salary, double rent, double food, double transport, double other) {
        this.salary = salary;
        this.rent = rent;
        this.food = food;
        this.transport = transport;
        this.other = other;
        return salary + rent + food + transport + other;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //setters and getters for rent, food, transport, other
    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }


}
