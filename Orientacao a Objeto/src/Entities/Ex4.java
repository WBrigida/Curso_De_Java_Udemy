package Entities;

public class Ex4 {
    private int number;
    private String holder;
    private double balance;

    public Ex4(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Ex4 (int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amaunt){
        balance += amaunt;
    }

    public void withdraw(double amaunt){
        balance -= amaunt + 5.0;
    }

    public String toString(){
        return "Account"
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
