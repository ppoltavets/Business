package org.example;

public class Income {
    private double income;
    public double IncomeCalc(double income){
        this.income = income + 1000;
        return income;
    }
    //getter and setter for income

    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
}
