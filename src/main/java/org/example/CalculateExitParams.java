package org.example;

public class CalculateExitParams {

    public double availableMoney(double salary, double rent, double food, double transport, double other) {
        CalculateEntryParams cep = new CalculateEntryParams();
        cep.CalculateEntryParamsEntity(200,200,200,200,200);
        Income income = new Income();
        income.IncomeCalc(200);
        return cep.getSalary() - cep.getRent() - cep.getFood() - cep.getTransport() - cep.getOther() + income.getIncome();
    }
}
