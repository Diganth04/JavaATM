/**
 * AtmOperationsInterface.java
 *
 * This interface defines the basic operations of an ATM,
 * including viewing balance, depositing, withdrawing money,
 * and viewing a mini statement.
 */

public interface AtmOperationsInterface {

    /**
     * Display the current account balance.
     */
    void viewBalance();

    /**
     * Deposit money into the account.
     * @param depositAmount amount to deposit
     */
    void depositMoney(double depositAmount);

    /**
     * Withdraw money from the account.
     * @param withdrawAmount amount to withdraw
     */
    void withdrawMoney(double withdrawAmount);

    /**
     * Display the mini statement showing recent transactions.
     */
    void viewMiniStatement();
}
