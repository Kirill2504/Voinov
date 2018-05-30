package com.company.Others;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (getX() != rectangle.getX()) return false;
        if (getY() != rectangle.getY()) return false;
        return getZ() == rectangle.getZ();
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
        shapes[0] = new Rectangle("Black", 5, 5, 6);
        shapes[1] = new Circle("White", 5, 5, 6);
        for (Shape shape : shapes) {
            shape.draw();

        }
        System.out.println(shapes[0]==shapes[1]);
        System.out.println(shapes[0].equals(shapes[1]));

    }
}
