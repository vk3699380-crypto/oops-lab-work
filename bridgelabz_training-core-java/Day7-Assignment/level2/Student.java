class Student {
    String name;
    int rollNumber;
    int marks;
    char grade;
    void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'F';
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ankit";
        s.rollNumber = 101;
        s.marks = 82;
        s.calculateGrade();
        s.display();
    }
}
