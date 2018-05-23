package com.company;

public class Aspirant extends Student {
    private int work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, int work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public Aspirant(String petr, String petrov, int i, String work2) {
        super(petr, petrov, i, work2);
    }

    public double getScholarhip() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public static void main(String[] agrgs) {
        Student student1 = new Student("Ivan", "Ivanov", 5, "work1");
        Aspirant aspirant2 = new Aspirant("Petr", "Petrov", 4, "work2");
        Student student3 = new Student("Kirill", "Kirillov", 5, "work3");

        Student [] students ={student1,aspirant2,student3};
        for(Student s:students){
            System.out.println(s.getLastName()+" "+ s.getScholarhip());
        }
    }


}
