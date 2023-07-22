package interfaceDemo;

public class Bank {

    SavingAccount savingAccount;
    CurrentAccount currentAccount;


    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setBalance(600000);
        savingAccount.viewBalance();
        savingAccount.deposit(50000);
        savingAccount.viewBalance();
        savingAccount.withdraw(20000);
        savingAccount.viewBalance();
        savingAccount.calculateInterest(7);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setBalance(50000);
        currentAccount.viewBalance();
        currentAccount.deposit(5000);
        currentAccount.viewBalance();
        currentAccount.withdraw(10000);
        currentAccount.viewBalance();
        currentAccount.calculateInterest(9);
    }
}
