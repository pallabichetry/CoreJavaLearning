package interfaceDemo;

public class CurrentAccount implements Accounts{

    private int Balance;



    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    @Override
    public void deposit(int amt) {
        Balance = Balance + amt;
        System.out.println("Amount deposit "+ amt);
    }

    @Override
    public void withdraw(int amt) {
        Balance = Balance - amt;
        System.out.println("Withdraw amount "+ amt);
    }

    @Override
    public void calculateInterest(int r) {
        System.out.println("Interest = " +0.01*r*Balance);
    }

    @Override
    public void viewBalance() {
        System.out.println("Balance in current account is : " +Balance);
    }
}
