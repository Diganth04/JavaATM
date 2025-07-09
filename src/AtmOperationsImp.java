import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implements the ATM operations like deposit, withdrawal, and mini statement.
 */
public class AtmOperationsImp implements AtmOperationsInterface {
    ATM atm = new ATM();

    // Using LinkedHashMap to preserve insertion order for mini statement
    Map<Double, String> minstmt = new LinkedHashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance: $" + atm.getBalance());
    }

    @Override
    public void depositMoney(double depositAmount) {
        minstmt.put(depositAmount, " deposited");
        System.out.println("$" + depositAmount + " deposited successfully.");
        atm.setBalance(atm.getBalance() + depositAmount);//Previous Balance plus amount deposited
        viewBalance();
    }

    @Override
    public void withdrawMoney(double withdrawAmount) {
        // Validate withdrawal amount
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                minstmt.put(withdrawAmount, " withdrawn");
                System.out.println("$" + withdrawAmount + " withdrawn successfully.");
                atm.setBalance(atm.getBalance() - withdrawAmount);//Subtracting the amount withdrawn from current balance
                viewBalance();
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please enter the amount in multiples of 500.");
        }
    }

    @Override
    public void viewMiniStatement() {
        System.out.println("\nMini Statement:");
        for (Map.Entry<Double, String> entry : minstmt.entrySet()) {
            System.out.println("$" + entry.getKey() + entry.getValue());
        }
        System.out.println();
    }
}
