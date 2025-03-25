public class Main {
    public static void main(String[] args) {
        BankCustomers bankCustomer = new BankCustomers();

        TransactionAccount transactionAccount1 = new TransactionAccount("111", "Maryam", 1000);
        TransactionAccount transactionAccount2 = new TransactionAccount("222", "Shirin", 2000);
        TransactionAccount transactionAccount3 = new TransactionAccount("333", "Zhina", 3000);
        SavingAccount savingAccount1 = new SavingAccount("123", "Sara", 1000);
        SavingAccount savingAccount2 = new SavingAccount("456", "Parisa", 2000);
        SavingAccount savingAccount3 = new SavingAccount("789", "Saba", 3000);

        bankCustomer.addAccount(transactionAccount1);
        bankCustomer.addAccount(transactionAccount2);
        bankCustomer.addAccount(transactionAccount3);
        bankCustomer.addAccount(savingAccount1);
        bankCustomer.addAccount(savingAccount2);
        bankCustomer.addAccount(savingAccount3);

        BankAccount foundAccount = bankCustomer.findAccount("123");
        if (foundAccount != null) {
            System.out.println("balance of foundAccount: " + foundAccount.getBalance());
            foundAccount.deposit(100);
            System.out.println("Balance after deposit: " + foundAccount.getBalance());
        }

        BankAccount fakeAccount = bankCustomer.findAccount("444");

        foundAccount.deposit(-100);

        savingAccount1.calculateInterest();
        transactionAccount1.calculateInterest();

        BankAccount account123 = bankCustomer.findAccount("123");
        BankAccount account111 = bankCustomer.findAccount("111");

        savingAccount1.withdraw(100);
        savingAccount2.withdraw(-100);
        savingAccount3.withdraw(100000);

        transactionAccount1.withdraw(100);
        transactionAccount2.withdraw(-100);
        transactionAccount3.withdraw(100000);

        bankCustomer.showAllBalances();
    }
}