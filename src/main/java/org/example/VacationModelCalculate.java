package org.example;

public class VacationModelCalculate {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (threshold > 0) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses;
                threshold /= 3;
            } else {
                money += + income;
                money -= expenses;
            }
        }
        return count;
    }
}
