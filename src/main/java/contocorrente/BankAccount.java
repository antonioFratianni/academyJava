package contocorrente;

public class BankAccount {

    double accountNumber;
    String nome;
    String surname;
    String email;
    double balance;

    public BankAccount(int accountNumber, String nome, String surname, String email, double balance) {
        this.accountNumber = accountNumber;
        this.nome = nome;
        this.surname = surname;
        this.email = email;
        this.balance = balance;
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
