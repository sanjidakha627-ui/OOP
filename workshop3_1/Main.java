package workshop3_1;

public class Main {
	// Main Class (Testing Everything)

	    public static void main(String[] args) {

	        // 4: Creating BankAccount object
	        BankAccount acc1 = new BankAccount("12345", 1000, "Sanjida", "Kathmandu");
	        acc1.depositMoney(500);
	        acc1.withdrawMoney(300);

	        // Constructor overloading
	        BankAccount acc2 = new BankAccount("67890");
	        BankAccount acc3 = new BankAccount(); // prints "User created!"

	        // 6: Lamp example
	        Lamp lamp = new Lamp();
	        lamp.turnOn();
	        lamp.turnOff();

	        // 9: Box examples
	        Box cube = new Box(5);
	        cube.getVolume();

	        Box cuboid = new Box(2, 3, 4);
	        cuboid.getVolume();

	        Box defaultBox = new Box();
	        defaultBox.getVolume();

	        // 11: Address example
	        Address addr = new Address();
	        addr.setStreet("Main Street");
	        addr.setCity("Kathmandu");
	        addr.setZipCode(44600);

	        // 12: Customer example
	        Customer c1 = new Customer(1, "Sanjida", acc1);

	        System.out.println("Customer Name: " + c1.getName());
	        System.out.println("Balance: " + c1.getAccount().getBalance());
	    }

}
