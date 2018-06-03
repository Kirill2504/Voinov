package com.company.Interface;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
            this.name = name;
        }


    @Override
    public void print() {
        System.out.println("");
        }

    public String getName() {
        return name;
        }

    public void setName(String name) {
        this.name = name;
        }

    public static void main(String[] args) {
        }
}
