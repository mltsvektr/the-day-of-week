package ru.maltseva.thedayofweek.model.service;

import ru.maltseva.thedayofweek.model.entity.Days;

import java.util.Scanner;

public class DaysManager {
    public static Days getDayFromConsole() {
        System.out.println("Введите день недели: ");
        Scanner console = new Scanner(System.in);
        String day = console.nextLine();
        return Days.valueOf(day.toUpperCase());
    }
}
