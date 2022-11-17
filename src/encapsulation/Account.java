package encapsulation;

public class Account {
    private int accountNo;
    private String Name;
    private Double Amount;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Double getAmount() {
        return Amount;
    }
}

class AccountImpl{
    public static void main(String[] args) {
       Account account = new Account();
       account.setAccountNo(903425689);
       account.setName("Ayesha");
       account.setAmount(60000d);
        System.out.println("ACCOUNT NO :" + account.getAccountNo());
        System.out.println("ACCOUNT HOLDER NAME :" + account.getName());
        System.out.println("AMOUNT :" + account.getAmount());

    }
}
