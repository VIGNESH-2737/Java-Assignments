import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.printInfo();
        System.out.println();
        
        
        Shape triangle = new Triangle();
        triangle.printInfo();
        System.out.println();
        
        Shape rectangle = new Rectangle();
        rectangle.printInfo();
        System.out.println();
        
        Shape square = new Square();
        square.printInfo();
        //System.out.println();
    }
}


abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
    abstract void printInfo();
}


class Circle extends Shape {
    private final int vertex = 0;
    private final int edges = 0;
    private double radius;

    public Circle() {
        System.out.println("Circle is a Shape with " + vertex + " vertex and " + edges + " edges.");
        initRadius();
    }

    private void initRadius() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        this.radius = scan.nextDouble();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printInfo() {
        System.out.println("Circle -> Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}


class Triangle extends Shape {
    private final int vertex = 3;
    private final int edges = 3;
    private double a, b, c;

    public Triangle() {
        System.out.println("Triangle is a Shape with " + vertex + " vertex and " + edges + " edges.");
        initSides();
    }

    private void initSides() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side A of Triangle: ");
        this.a = scan.nextDouble();
        System.out.print("Enter side B of Triangle: ");
        this.b = scan.nextDouble();
        System.out.print("Enter side C of Triangle: ");
        this.c = scan.nextDouble();
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public void printInfo() {
        System.out.println("Triangle -> Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}


class Rectangle extends Shape {
    private final int vertex = 4;
    private final int edges = 4;
    private double length, width;

    public Rectangle() {
        System.out.println("Rectangle is a Shape with " + vertex + " vertex and " + edges + " edges.");
        initDimensions();
    }

    private void initDimensions() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        this.length = scan.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        this.width = scan.nextDouble();
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void printInfo() {
        System.out.println("Rectangle -> Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}


class Square extends Shape {
    private final int vertex = 4;
    private final int edges = 4;
    private double side;

    public Square() {
        System.out.println("Square is a Shape with " + vertex + " vertex and " + edges + " edges.");
        initSide();
    }

    private void initSide() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side length of Square: ");
        this.side = scan.nextDouble();
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public void printInfo() {
        System.out.println("Square -> Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}


