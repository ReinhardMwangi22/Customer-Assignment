//package assignment;
// Customer assignment

public class Customer {
    public static void main(String[] args) {

        Customer localCustomer = new Customer(500,"Mwas","KIJAbe 001", "Kenya", "079865477", 500.00);
        Customer internationalCustomer = new Customer(10000, "Henry", "Carlifornia 213", "USA", "21345677", 123345666.00);
    
        System.out.println(localCustomer.accountNo);
        System.out.println(internationalCustomer.address);
    }

    int accountNo;
    String name;
    String address;
    String country;
    String phoneNo;
    double balance;

    public Customer(int accountNo, String name, String address, String country, String phoneNo, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.country = country;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited: "+ amount);

        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew:" + amount);
        } else if (amount> balance) {
            System.out.println("Insufficient balance.");

        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void renew() {
        System.out.println("You renewed your account."+ balance);
    }

    public void check_balance() {
        System.out.println("Your current balance is: "+ balance);
    }

   

   




    
}
