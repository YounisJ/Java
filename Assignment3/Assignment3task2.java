class BankAccount
{
    private double balance=10000;
    private int account_number=364783263;

    public double getBalance() {
        return balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    class Transaction
    {
        private double available_amount;
        private String Description;


        double deposit(double transaction_amount , String description)
        {
            available_amount=balance-transaction_amount;
            System.out.println("Transaction amount   : " +transaction_amount);
            System.out.println("Availabale Balance   : " +available_amount);
            return balance-transaction_amount;
        }

    }
}
public class Assignment3task2 {
    public static void main(String[] args) {
        BankAccount bank_obj1=new BankAccount();

        BankAccount.Transaction Tra_obj1=bank_obj1.new Transaction();



        System.out.println("Account Number       : "+bank_obj1.getAccount_number());
        System.out.println("Initial Balance      : "+bank_obj1.getBalance()) ;

        Tra_obj1.deposit(4000,"Deposited ");

    }
}
