package exceptionhandling;

class ICICI {
    double amount = 6000;

    void depositAmount(double depositAmount) throws InvalidAmountException {


        if (amount <= depositAmount) {

        } else {
            amount += depositAmount;

            System.out.println("Balance " + amount);
        }


    }
}

public class Bank2Impl {
    public static void main(String[] args) {
        ICICI icici = new ICICI();

        try {
            icici.depositAmount(4000);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
