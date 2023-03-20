package ru.netology.services.PackagesCycles1.services;

public class RestAmountService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // если на счету есть threshold денег или больше, то выбираем отдых
                money = money - expenses; // сколько мы потеряли ( накопления - сколько потратили )
                money = money / 3; // накопления ещё уменьшается в три раза
                count++; // увеличиваем счётчик месяцев отдыха на 1 ( инкремент )
            } else {
                money = money + income - expenses; // если на счету меньше threshold денег, то работаем ( накопления + сколько заработали - сколько потратили )
            }
        }
        return count;
    }
}
