package org.example;

import javax.swing.*;
import java.util.*;

public class Worker {
    private String name;
    private String lastName;
    private double income;
    private Map<Car, Integer> carUsage = new HashMap<>();

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Worker(String name, String lastName, double income) {
        this.name = name;
        this.lastName = lastName;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getIncome() {
        return income;
    }

    public static void top3Workers(List<Worker> workers) {
        List<Worker> sortedWorkers = new ArrayList<>(workers);
        sortedWorkers.sort((w1, w2) -> Double.compare(w2.income, w1.income)); //todo omowic na next zajeciach
        System.out.println("TOP 3 WORKERS ARE: " + sortedWorkers.subList(0,3));



//        Worker worker1 = null;
//        Worker worker2 = null;
//        Worker worker3 = null;
//        for (Worker worker : workers) {
//            if (worker1 == null || worker.income > worker1.income) {
//                worker1 = worker;
//            } else if ((worker2 == null) || ((worker1.income > worker.income) && (worker.income > worker2.income))) {
//                worker2 = worker;
//            } else if ((worker3 == null) || ((worker2.income > worker.income) && (worker.income > worker3.income))) {
//                worker3 = worker;
//            }
//        }
//        System.out.println("Top1: " + worker1.getName() + " " + worker1.getLastName() + " " + worker1.getIncome());
//        System.out.println("Top2: " + worker2.getName() + " " + worker2.getLastName() + " " + worker2.getIncome());
//        System.out.println("Top3: " + worker3.getName() + " " + worker3.getLastName() + " " + worker3.getIncome());
    }

    public void useCar(Car car, int days) {
        carUsage.put(car, carUsage.getOrDefault(car, 0) + days);
    }

    public void checkCarUsage() {
        System.out.println(name + " " + lastName);
        for (Map.Entry<Car, Integer> entry : carUsage.entrySet()) {
            System.out.println(entry.getKey().getBrand() + " " + entry.getKey().getModel() + " been used: " + entry.getValue() + "days");
        }
        System.out.println();
    }
}
