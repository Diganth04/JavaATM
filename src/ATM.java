/**
 * Represents the ATM account model containing balance and transaction amounts.
 */
public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public ATM() {
        // Constructor for ATM object initialization
    }

    // Getter and Setter for Balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter and Setter for Deposit Amount
    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    // Getter and Setter for Withdraw Amount
    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
