package contocorrente;

import java.util.Scanner;

public class BalanceOperations implements Bank {

    BankAccount bankAccount;

    public BalanceOperations(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void balance() {
        System.out.println(bankAccount.balance);

    }

    @Override
    public void checkBalance() {
        if (bankAccount.balance <= 0)
            System.out.println("Il saldo e vuoto");
    }

    @Override
    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire l importo del deposito");
        bankAccount.balance = bankAccount.balance + input.nextInt();
        balance();
    }

    @Override
    public void whitdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire l importo del prelievo");
        int whitdraw = input.nextInt();
        if (whitdraw > bankAccount.balance) {
            System.out.println("Impossibile effettuare il prelievo");
        }
        bankAccount.balance = bankAccount.balance - whitdraw;
        balance();
    }
}
