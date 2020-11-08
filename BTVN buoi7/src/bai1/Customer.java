package bai1;

public class Customer  extends Person{
    private int balance;

    public Customer() {
    }

    public Customer(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Customer(String name, String address, int balence) {
            super(name, address);
            this.balance=balence;
    }
    @Override
    public void Display(){
        System.out.println("Name of customer: " + getName());
        System.out.println("Address of customer: " + getAddress());
        System.out.println("Balance of customer: " + getBalance());
    }
}

