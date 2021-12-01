public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount clint = new BankAccount(0, 0);
        BankAccount devin = new BankAccount(500, 50000);
        System.out.println(clint.getAccountNumber());
        System.out.println("Checking account:$"+ clint.getCheckingAmount() + " " + "Savings account:$" + clint.getSavingsAmount());
        clint.depositChecking(1000.99);
        System.out.println(BankAccount.getAllAccounts());
        System.out.println("Checking account:$"+ clint.getCheckingAmount() + " " + "Savings account:$" + clint.getSavingsAmount());
        clint.withdrawChecking(100.00);
        clint.withdrawChecking(200.00);
        clint.withdrawChecking(2000.00);
        clint.withdrawChecking(200.00);
        clint.depositSavings(10000.99);
        clint.withdrawSavings(200.00);
        System.out.println("Checking account:$"+ clint.getCheckingAmount() + " " + "Savings account:$" + clint.getSavingsAmount());
        System.out.println(BankAccount.checkAllAccounts());

    }

}
