import java.util.Scanner;

/**
 * Main class to run the ATM interface simulation.
 */
public class MainClass {
    public static void main(String[] args) {
        // Create an object for ATM operations
        AtmOperationsInterface op = new AtmOperationsImp();

        // Hardcoded account credentials
        int accountNumber = 1234;
        int pin = 1234;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine\n");

        // Prompt user for account details
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter PIN: ");
        int accPin = sc.nextInt();

        // Validate credentials
        if (accNo == accountNumber && accPin == pin) {
            System.out.println("\nLogin Successful. Welcome!\n");

            while (true) {
                // Main menu options
                System.out.println("========= ATM Menu =========");
                System.out.println("1. View Available Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        op.viewBalance();
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        op.depositMoney(depositAmount);
                        break;

                    case 3:
                        // Withdrawal with retry on invalid input
                        while (true) {
                            System.out.print("Enter amount to withdraw (multiples of 500): ");
                            double withdrawAmount = sc.nextDouble();

                            if (withdrawAmount % 500 == 0) {
                                op.withdrawMoney(withdrawAmount);
                                break; // Exit withdrawal loop on success
                            } else {
                                System.out.println("Invalid amount. Please enter in multiples of 500.");
                                System.out.print("Do you want to try again? (y/n): ");
                                char retry = sc.next().toLowerCase().charAt(0);
                                if (retry != 'y') {
                                    System.out.println("Returning to main menu...\n");
                                    break; // Exit loop and go back to main menu
                                }
                            }
                        }
                        break;

                    case 4:
                        op.viewMiniStatement();
                        break;

                    case 5:
                        System.out.println("Thank you! Please collect your card.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.\n");
                }
            }

        } else {
            System.out.println("Incorrect account number or PIN. Access denied.");
        }
    }
}
