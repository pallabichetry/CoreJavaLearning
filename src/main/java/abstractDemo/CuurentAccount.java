package abstractDemo;

public class CuurentAccount extends BankAccount{
    @Override
    public void deposit() {
        System.out.println("deposit in the current account");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw from the current account");
    }

    public static void main(String[] args) {
        CuurentAccount cuurentAccount = new CuurentAccount();
        cuurentAccount.deposit();
        cuurentAccount.withdraw();
    }
}
