package com.codegym;

public class ShapeFactory {
    private Shape shape;

    public Shape getShape(String type) {
        switch (type) {
            case "Circle": {
                return new Cricle();
            }
            case "Square": {
                return new Square();
            }

            case "Rectangle": {
                return new Rectangle();
            }

            default: {
                return null;
            }
        }
    }
}
