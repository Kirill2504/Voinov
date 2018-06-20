package com.company.Interface;


import com.company.Others.Animal;

import java.io.Serializable;

public class Gen<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T a;
    private V b;
    private K c;


    public Gen(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void showTypes() {
        System.out.println("Type is:" + a.getClass().getName());
        System.out.println("Type is:" + b.getClass().getName());
        System.out.println("Type is:" + c.getClass().getName());
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }

    public K getC() {
        return c;
    }

    public void setC(K c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Gen<Integer, Animal, Integer> c = new Gen<>(2002, new Animal(), 04);

        c.showTypes();
    }
}
