package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculateEntryParams cep = new CalculateEntryParams();
        CalculateExitParams cex = new CalculateExitParams();
        double total = cep.CalculateEntryParamsEntity(cep.getSalary(), cep.getRent(), cep.getFood(), cep.getTransport(), cep.getOther());
        System.out.println("Total: " + total);
        System.out.println(cex.availableMoney());
    }
}

