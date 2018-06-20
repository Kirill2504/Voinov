package com.company.Others;


import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MinMax)) return false;

        MinMax<?> minMax = (MinMax<?>) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getArray(), minMax.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArray());
    }

    public T min() {
        T min = array[0];
        for (T value : array) {
            if (value.doubleValue() < min.doubleValue()) {
                min = value;
            }
        }
        return min;
    }

    public T max() {
        T max = array[0];
        for (T value : array) {
            if (value.doubleValue() > min().doubleValue()) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        MinMax<Integer> obl = new MinMax<>(new Integer[]{1, 2, 3, 4, 5});
    }
}


