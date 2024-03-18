package ru.bell;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstTask {

    public static void main(String[] args) {
        List<Map<String, String>> employees = Arrays.asList(
                Map.of("Имя", "Кирилл", "Возраст", "26", "Должность", "Middle Java Developer", "Зарплата", "150000 руб"),
                Map.of("Имя", "Виталий", "Возраст", "28", "Должность", "Senior Java Automation", "Зарплата", "2000$"),
                Map.of("Имя", "Александр", "Возраст", "31", "Должность", "Junior Functional Tester", "Зарплата", "50000 руб"),
                Map.of("Имя", "Дементий", "Возраст", "35", "Должность", "Dev-Ops", "Зарплата", "1500$")
        );

        List<String> youngerThan30 = employees.stream()
                .filter(employee -> {
                    int age = Integer.parseInt(employee.get("Возраст"));
                    return age < 30;
                })
                .map(employee -> employee.get("Имя"))
                .collect(Collectors.toList());
        System.out.println("Сотрудники младше 30 лет: " + youngerThan30);

        List<String> salaryInRubles = employees.stream()
                .filter(employee -> employee.get("Зарплата").contains("руб"))
                .map(employee -> employee.get("Имя"))
                .collect(Collectors.toList());
        System.out.println("Сотрудники, получающие зарплату в рублях: " + salaryInRubles);

        double averageAge = employees.stream()
                .mapToInt(employee -> Integer.parseInt(employee.get("Возраст")))
                .average()
                .orElse(0);
        System.out.println("Средний возраст всех сотрудников: " + averageAge);
    }
}