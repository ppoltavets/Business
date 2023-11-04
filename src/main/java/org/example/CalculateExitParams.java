package org.example;

public class CalculateExitParams {

    public double availableMoney(double salary, double rent, double food, double transport, double other) {
        CalculateEntryParams cep = new CalculateEntryParams();
        cep.setSalary(salary);
        cep.setRent(rent);
        cep.setFood(food);
        cep.setTransport(transport);
        cep.setOther(other);
        Income income = new Income();
        income.IncomeCalc(200);
        return cep.getSalary() - cep.getRent() - cep.getFood() - cep.getTransport() - cep.getOther() + income.getIncome();
    }
}
