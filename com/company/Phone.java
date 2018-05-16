package com.company;

public class Phone {
    int num;
    String model;
    int weight;

    Phone(int n, int w, String m) {
        num = n;
        weight = w;
        model = m;
    }

    Phone(int n, String m) {
        this(4, 5, "fdf");
        n = 55;
        m = "kk";
    }

    Phone() {

    }

    void receiveCall(String name, int num) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name + num);
    }

    int getNumber() {
        return num;
    }

    void sendMeassage(String... numbers) {
        for (String n : numbers)
            System.out.println("Sending message to phone " + n);
    }

}