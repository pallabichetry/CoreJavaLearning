package abstractDemo;

public class SavingAccount extends BankAccount{
    @Override
    public void deposit() {
        System.out.println("deposit in the saving account");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw from the saving account");

    }

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit();
        savingAccount.withdraw();
    }
}
