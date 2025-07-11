package entites;

public class Account {

    private int number;
    private String holder;
    private Double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance =0.0;
    }

    public Account(int number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.balance =0.0;
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

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account"
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f",balance);

    }
}
