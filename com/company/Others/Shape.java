package com.company.Others;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        return getColor().equals(shape.getColor());
    }

    @Override
    public int hashCode() {
        return getColor().hashCode();
    }

    public static void main(String[] args) {

    }
}
