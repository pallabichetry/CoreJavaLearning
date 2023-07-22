package encaptulation;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456899);
        System.out.println(bankAccount.getAccountNumber());
    }
}
