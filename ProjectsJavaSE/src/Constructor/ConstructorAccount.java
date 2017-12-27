package Constructor;

public class ConstructorAccount {

    private int accountId;
    private String name;
    private int balance;

    public ConstructorAccount(int accountId, String name, int balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            amount -= balance;
        } else {
            System.out.println("not enough money");
        }
    }
    public String getName(){
        return name;
    }
    public int GetAccountId(){
        return accountId;
          }
    
    public int GetBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return ("Name"+name+" Balance "+balance+" Account Number "+accountId);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
