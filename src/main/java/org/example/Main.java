package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan healthplan = new Healthplan(5, "Eren", Plan.BASIC);
        String[] healthPlans = {"Eren"};
        Employee employee = new Employee(5, "Eren", "Eren@eren.com", "5", healthPlans);
        Company company = new Company(5, "Eren", 100000.0, healthPlans);

    }
}