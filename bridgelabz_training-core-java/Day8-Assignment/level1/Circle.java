class Circle {
    double radius;

    Circle() {
        this(5.0);
    }

    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + 3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();
        Circle c2 = new Circle(10.0);
        c2.display();
    }
}
