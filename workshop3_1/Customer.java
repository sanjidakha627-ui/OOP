package workshop3_1;

public class Customer {
	// 12 Customer Class (Combining Concepts)
	
	    private int customerId;
	    private String name;
	    private BankAccount account;

	    // Parameterized constructor
	    public Customer(int id, String name, BankAccount account) {
	        this.customerId = id;
	        this.name = name;
	        this.account = account;
	    }

	    // Getter methods
	    public int getCustomerId() {
	        return customerId;
	    }

	    public String getName() {
	        return name;
	    }

	    public BankAccount getAccount() {
	        return account;
	    }
	

}
