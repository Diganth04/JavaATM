/**
 * Interface declaring all ATM operation methods.
 */
public interface AtmOperationsInterface {
    void viewBalance();
    void depositMoney(double depositAmount);
    void withdrawMoney(double withdrawAmount);
    void viewMiniStatement();
}
