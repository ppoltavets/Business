package org.example;

public class Main {
    public static void main(String[] args) {

        CalculateEntryParams cep = new CalculateEntryParams();
        double salary = 1000;
        double rent = 200;
        double food = 100;
        double transport = 50;
        double other = 0;
        cep.setSalary(150);
        cep.setRent(200);
        cep.setFood(100);
        cep.setTransport(50);

        double total = cep.CalculateEntryParams(salary, rent, food, transport, other);
        System.out.println("Total: " + total);

    }
}

