package exceptionhandling;


class HDFC {
    double amount = 5000;

    void depositAmount(double depositAmount) {
        amount += depositAmount;
        System.out.println("Balance " + amount);
    }

    void withdraw(double withdrawAmount) throws InsufficientBalanceExceptionDemo {
        if (amount < withdrawAmount) {
            throw new InsufficientBalanceExceptionDemo("Insufficient Balance");
        } else {
            amount -= withdrawAmount;
            System.out.println("Remaining balance =" + amount);
        }

    }
}

public class Bank1Impl {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.depositAmount(5000);
        try {
            hdfc.withdraw(6000);
        } catch (InsufficientBalanceExceptionDemo e) {
            System.out.println(e.getMessage());
        }
    }
}
