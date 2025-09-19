class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        CGPA = c;
    }

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }

    void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent ps = new PostgraduateStudent(101, "Ankit", 9.2);
        ps.display();
    }
}
