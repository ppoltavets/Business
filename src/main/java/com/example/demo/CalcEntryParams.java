package com.example.demo;

public class CalcEntryParams {
    public double CalcEntry(double rent, double prodCost, double salary, double other) {
        double sum = rent + prodCost + salary + other;
        return sum;
    }
}
