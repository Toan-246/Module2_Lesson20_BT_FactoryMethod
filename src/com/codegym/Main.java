package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeFactory shapeFactory1 = new ShapeFactory();
        System.out.println("Nhập loại hình");
        String type = scanner.nextLine();
        Shape shape = shapeFactory1.getShape(type);
        shape.draw();
    }
}
