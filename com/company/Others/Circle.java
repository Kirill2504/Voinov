package com.company.Others;

/**
 * Created by Student on 23.05.2018.
 */
public class Circle extends Shape {
    private int x, y, z;

    public Circle(String color, int x, int y, int z) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (getX() != circle.getX()) return false;
        if (getY() != circle.getY()) return false;
        return getZ() == circle.getZ();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getX();
        result = 31 * result + getY();
        result = 31 * result + getZ();
        return result;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Black", 3, 5, 6);
        shapes[1] = new Circle("White", 5, 4, 3);


    }
}

