import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account){
        accountsList.add(account);
    }
    public void showAllBalances(){
        for (BankAccount bankAccount : accountsList){
            System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
            System.out.println("Account Number: " + bankAccount.getAccountNumber());
            System.out.println("Balance: " + bankAccount.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber){
        for (BankAccount bankAccount : accountsList){
            if(bankAccount.getAccountNumber().equals(accountNumber)){
                System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
                System.out.println("Account Number: " + bankAccount.getAccountNumber());
                System.out.println("Balance: " + bankAccount.getBalance());
                return bankAccount;
            }
        }
        System.out.println("Account not found with number: " + accountNumber);
        return null;
    }
}
