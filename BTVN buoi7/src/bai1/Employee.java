package bai1;

public class Employee extends Person {
    private int salary;

    public Employee() {
    }

    public Employee(String name, String address) {
        super(name, address);
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void Display(){
        System.out.println("Name of employee: " + getName());
        System.out.println("Address of employee: " + getAddress());
        System.out.println("Salary of employee: " + getSalary());
    }
}
