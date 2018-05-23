package com.company;

/**
 * Created by Student on 23.05.2018.
 */
public class Rectangle extends Shape {

    private int x, y, z;

    public Rectangle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void draw() {
        System.out.println("Рисуем круг" + getColor() + "с координатами: " + getX() + " " + getY() + " " + getZ());
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("Black", 3, 5, 6);
        shapes[1] = new Circle("White", 5, 4, 3);
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
