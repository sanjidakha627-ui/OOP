package workshop3_1;

public class BankAccount {


			// 3,4,5,7,10,13 BankAccount Class
		
			

			    // Attributes (10: balance is private)
			    private String accountNumber;
			    private double balance;
			    private String accountHolderName;
			    private String accountHolderAddress;

			    // 7: Parameterized Constructor
			    public BankAccount(String accNo, double bal, String name, String address) {
			        this.accountNumber = accNo;
			        this.balance = bal;
			        this.accountHolderName = name;
			        this.accountHolderAddress = address;
			    }

			    // 13: Constructor Overloading (Different ways to create object)

			    // Only account number
			    public BankAccount(String accNo) {
			        this.accountNumber = accNo;
			        this.balance = 0;
			    }

			    // No-argument constructor
			    public BankAccount() {
			        System.out.println("User created!");
			    }

			    // 5: depositMoney method
			    public void depositMoney(double amount) {
			        balance += amount;
			        System.out.println("Deposited: " + amount);
			        System.out.println("Current Balance: " + balance);
			    }

			    // 5: withdrawMoney method
			    public void withdrawMoney(double amount) {
			        if (amount <= balance) {
			            balance -= amount;
			            System.out.println("Withdrawn: " + amount);
			        } else {
			            System.out.println("Insufficient Balance!");
			        }
			        System.out.println("Current Balance: " + balance);
			    }

			    // 10: Getter for balance
			    public double getBalance() {
			        return balance;
			    }
			
}
