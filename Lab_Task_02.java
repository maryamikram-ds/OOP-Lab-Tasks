class Circle {
    public double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Account {
    public double balance;

    public Account() {
        balance = 0.0;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class Distance {
    public int feet;
    public double inches;

    public Distance() {
        feet = 0;
        inches = 0.0;
    }

    public Distance(int f, double i) {
        feet = f;
        inches = i;
    }

    public void display() {
        System.out.println("Feet: " + feet + ", Inches: " + inches);
    }
}

class Marks {
    public int mark1;
    public int mark2;
    public int mark3;

    public Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    public Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }
}

class Time {
    public int hr;
    public int min;
    public int seconds;

    public Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }

    public Time(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hr = h;
        } else {
            hr = 0;
        }

        if (m >= 0 && m < 60) {
            min = m;
        } else {
            min = 0;
        }

        if (s >= 0 && s < 60) {
            seconds = s;
        } else {
            seconds = 0;
        }
    }

    public void display() {
        System.out.printf("Time: %02d:%02d:%02d\n", hr, min, seconds);
    }
}

public class Runner {
    public static void main(String[] args) {
        System.out.println("=== TASK 1: CIRCLE ===");
        Circle c1 = new Circle();
        System.out.println("Circumference of c1: " + c1.calculateCircumference());

        Circle c2 = new Circle(5.5);
        System.out.println("Circumference of c2: " + c2.calculateCircumference());

        System.out.println("\n=== TASK 2: ACCOUNT ===");
        Account acc1 = new Account();
        acc1.deposit(500.0);
        System.out.println("Account 1 Balance: " + acc1.balance);

        Account acc2 = new Account(1000.0);
        acc2.withdraw(200.0);
        System.out.println("Account 2 Balance: " + acc2.balance);

        System.out.println("\n=== TASK 3: DISTANCE ===");
        Distance d1 = new Distance();
        d1.display();

        Distance d2 = new Distance(5, 8.5);
        d2.display();

        System.out.println("\n=== TASK 4: MARKS ===");
        Marks student1 = new Marks();
        System.out.println("Student 1 Total Marks: " + student1.calculateSum());

        Marks student2 = new Marks(85, 90, 78);
        System.out.println("Student 2 Total Marks: " + student2.calculateSum());

        System.out.println("\n=== TASK 5: TIME ===");
        Time t1 = new Time();
        t1.display();

        Time t2 = new Time(14, 30, 45);
        t2.display();

        Time t3 = new Time(25, 65, 80);
        t3.display();
    }
}
