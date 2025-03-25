public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber,String accountHolderName,double initialBalance){
        super(accountNumber,accountHolderName,initialBalance);
    }
    @Override
    public void calculateInterest(){
        System.out.println("There is no calculate Interest for " + getAccountNumber());
    }
    @Override
    public void withdraw (double amount){
        if (amount > 0 && amount <= (balance + overDraftLimit)){
            balance -= amount;
            System.out.println(amount + " withdraw from " + getAccountNumber());
        }
        else
            System.out.println("is not valid amount");
    }
}
