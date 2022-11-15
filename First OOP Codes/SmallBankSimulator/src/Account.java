public class Account {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;
    
    // constructor with initial deposit
    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    // constructor without initial deposit
    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // method for deposit a given amount on the account 
    public void deposit(double value) {
        accountBalance += value;
    }
    // method for withdraw a given amount from the account 
    public void withdraw(double value) {
        accountBalance -= (value+5.00);
    }

    @Override
    public String toString() {
        return 
        "Account: "
        + accountNumber 
        + ", Holder: " 
        + accountHolder 
        + ", Balance: $"
        + String.format("%.2f\n", accountBalance);
    }
    
}
