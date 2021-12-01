import java.util.Random;

public class BankAccount {
    private double checking;
    private double savings;
    private String accountnumber;

    private static int numberOfAccounts = 0;
    private static double totalAmountOfMoney = 0;

    public BankAccount(){
        numberOfAccounts++;
    }

    public BankAccount(double checkingAmount, double savingsAmount) {
        checking = checkingAmount;
        savings = savingsAmount;
        numberOfAccounts++;
        totalAmountOfMoney += checkingAmount;
        totalAmountOfMoney += savingsAmount;
        accountnumber = generateAccountNumber();
    }

    public static int getAllAccounts(){
        return numberOfAccounts;
    }

    public double getCheckingAmount() {
        return this.checking;
    }

    public double getSavingsAmount() {
        return this.savings;
    }

    public void depositChecking(double money) {
        this.checking += money;
        System.out.println("You deposited " + money + " into your checking account.");
        System.out.println("Your total amount is now " + "$" + this.checking);
        totalAmountOfMoney += money;
    }

    public void depositSavings(double money) {
        this.savings += money;
        System.out.println("You deposited " + money + " into your savings account.");
        System.out.println("Your total amount is now " + "$" + this.savings);
        totalAmountOfMoney += money;
    }

    public void withdrawChecking(double money) {
        if (money <= this.checking) {
            this.checking -= money;
            System.out.println("You withdrew " + money + " out of your checking account.");
            System.out.println("Your total amount is now " + "$" + this.checking);
            totalAmountOfMoney -= money;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void withdrawSavings(double money) {
        if (money <= this.savings) {
            this.savings -= money;
            System.out.println("You withdrew " + money + " out of your savings account.");
            System.out.println("Your total amount is now " + "$" + this.savings);
            totalAmountOfMoney -= money;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static double checkAllAccounts() {
        return totalAmountOfMoney;
    }

    private String getRandomStringWithArray() {
        Random random = new Random();
        String useString = "abcdefghijklmnopqrstuvwxyz1234567890";
        String[] alphabet = new String[36];
        for (int i = 0; i < 36; i++) {
            alphabet[i] = String.valueOf(useString.charAt(i));
        }
        return alphabet[random.nextInt(36)];
    }

    private String generateAccountNumber(){
        String accountnumber = "";
        for(int i = 0; i <10; i++) {
            accountnumber = accountnumber + getRandomStringWithArray();
        }
        return accountnumber;
    }

    public String getAccountNumber() {
        return this.accountnumber;
    }

}