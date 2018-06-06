package com.company.Others;

import java.io.Writer;
import java.util.Scanner;


public class CutStr {
    public static void main(String[] args) {
        cut("I like Java!!!");
        cut("I like .net!!!");
        vr("fjjs lsl");
        trim("sdfdfdfdaaaaa");
        trim("sdfsdfdgbbbbaaaa");
        trim("sdfdfdfdqqqqqaaaaa");
        cutr();
        sum(4,65);
    }

    public static void cut(String str) {
        System.out.println(str.startsWith("I like Java"));
        System.out.println(str.startsWith("!!!"));
    }

    public static void vr(String str) {
        int lenghtStr = str.length();
        char lastSymb = str.charAt(lenghtStr - 1);
        System.out.println(lastSymb);
    }

    public static void sr(String str) {
        int pos = str.indexOf("Java");
        System.out.println(pos);
    }

    public static void trim(String str) {
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

    public static void cutr(){
        System.out.println("I like Java??".substring(7,11));
    }

    public static void sum(int a,int b){
        StringBuilder sb= new StringBuilder(50);;
        sb.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        sb.append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n");
        sb.append(a).append(" * ").append(b).append(" = ").append(a-b).append("\n");
        System.out.println(sb);
    }
}