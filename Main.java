import java.util.Scanner;

class Student {
    private String studentID;
    private String name;
    private String department;
    private double gpa;

    public Student(String studentID, String name, String department, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }

    public void registerCourse(String courseName) {
        System.out.println(name + " has registered for " + courseName);
    }

    public void displayInfo() {
        System.out.println("ID: " + studentID + " | Name: " + name + " | Dept: " + department + " | GPA: " + gpa);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

class Car {
    private String brand;
    private String model;
    private int year;
    private double speed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0.0;
    }

    public void accelerate(double increment) {
        speed += increment;
        System.out.println(brand + " " + model + " speed increased to " + speed + " km/h");
    }

    public void brake() {
        speed = 0.0;
        System.out.println(brand + " " + model + " has stopped");
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("SP24-BDS-001", "Maryam Ikram", "Mathematics & Data Science", 3.9);
        student.displayInfo();
        student.registerCourse("Object Oriented Programming");

        System.out.println();

        Time time = new Time(10, 30, 0);
        time.displayTime();

        System.out.println();

        Car car = new Car("Toyota", "Corolla", 2024);
        car.accelerate(60.0);
        car.brake();

        System.out.println();

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
