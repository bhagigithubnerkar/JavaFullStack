package exceptionhandling;


import java.util.Scanner;

class CBI {
    double amount = 10000;

    void depositAmount(double depositAmount) {
        amount += depositAmount;
        System.out.println("Balance " + amount);
    }

    void withdrawAmount(double withdrawAmount) throws InsufficientBalanceException {
        if (amount < withdrawAmount) {
            throw new InsufficientBalanceException("Insufficient Balance");

        } else {
            amount -= withdrawAmount;
            System.out.println("Remaining Balance " + amount);
        }
    }

    double getBalance() {
        return amount;
    }
}

public class Bank3Impl {
    public static void main(String[] args) {
        CBI cbi = new CBI();
        cbi.depositAmount(5000);
        try {
            cbi.withdrawAmount(20000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter amount for deposit");
                    double depositAmt = sc.nextDouble();
                    cbi.depositAmount(depositAmt);
                    break;
                case 2:
                    try {
                        System.out.println("Enter amount for withdraw");
                        double withdrawAmt = sc.nextDouble();
                        cbi.withdrawAmount(withdrawAmt);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(cbi.amount);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        } while (ch <= 4);
    }
}
