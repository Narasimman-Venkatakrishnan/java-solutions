package com.learning.java.solutions;

import java.util.Arrays;
import java.util.List;

public class AreaOfTriangleCoordinates {

    public static int printArea(List<Integer> X, List<Integer> Y) {
        //find area of triangle
        int area = Math.abs(X.get(0) * (Y.get(1) - Y.get(2)) + X.get(1) * (Y.get(2) - Y.get(0)) + X.get(2) * (Y.get(0) - Y.get(1))) / 2;
        System.out.println("Area of Triangle: " + area);
        return area;
    }

    public static void main(String[] args) {
        List<Integer> x_coordinates = Arrays.asList(1, 2, 5);
        List<Integer> y_coordinates = Arrays.asList(0, 6, 10);
        printArea(x_coordinates, y_coordinates);
    }

}

