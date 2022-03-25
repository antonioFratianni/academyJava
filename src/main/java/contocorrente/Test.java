package contocorrente;

public class Test {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(22332, "Mario", "Rossi", "mariored@gmail.com", 100);
        BalanceOperations balanceOperations = new BalanceOperations(bankAccount);

        //methods testing
        balanceOperations.balance();
        balanceOperations.checkBalance();
        balanceOperations.deposit();
        balanceOperations.whitdraw();

    }
}
