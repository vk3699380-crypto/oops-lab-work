class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(101, "IT", 75000);
        m.display();
        m.setSalary(80000);
        m.display();
    }
}
