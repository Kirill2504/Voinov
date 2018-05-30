package com.company.Others;

public class Phone {
    public static int count = 0;
    private String number = "none";
    int num;
    String model;
    int weight;

    Phone(int n, int w, String m) {
        num = n;
        weight = w;
        model = m;
        count++;
    }

    Phone(int n, String m) {
        this(4, 5, "fdf");
        n = 55;
        m = "kk";
    }

    public Phone(String number) {
        this.number = number;
        count++;
    }

    Phone() {
        count++;
    }

    static int getCountInstance() {
        return count;
    }

    protected void finalize(){
        System.out.println("In finalize");
        count--;
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