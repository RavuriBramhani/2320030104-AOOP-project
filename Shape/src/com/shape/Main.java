package com.shape;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5, 3);

        Shape circle = new Circle(4);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());

	}

}
