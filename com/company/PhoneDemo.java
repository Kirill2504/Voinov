package com.company;


public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.receiveCall("Мама");
        myPhone.getNumber();
        System.out.println(myPhone.getNumber());
        Phone myPhone2=new Phone(2,3,"jfjf");
        Phone myPhone3=new Phone(44,"hfghfff");
    }
}
