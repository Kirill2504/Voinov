package com.company.Interface;

/**
 * Created by Student on 13.06.2018.
 */
public class PrintableLocal {
    public static void main(String[]args){
        Printable printable =new Printable() {

            @Override
            public void print() {
                System.out.println("ANONIMUS CLASS");
            }
        };
        printable.print();
    }
}
