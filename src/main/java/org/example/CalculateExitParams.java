package org.example;

public class CalculateExitParams {
    CalculateEntryParams cep = new CalculateEntryParams();
    double salary = 200;
    double rent = 200;
    double food = 200;
    double transport = 200;
    double other = 200;


    public double availableMoney() {
        cep.CalculateEntryParamsEntity(salary, rent, food, transport, other);
        Income income = new Income();
        income.IncomeCalc(200);
        return income.getIncome()- cep.getSalary() - cep.getRent() - cep.getFood() - cep.getTransport() - cep.getOther();
    }
}
