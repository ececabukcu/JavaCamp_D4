package CoffeeShop;

public abstract class CustomerManager implements Icustomer {

	@Override
	public void Save(Customer customer) {
		
		System.out.println("Saved to db: " + customer.getFirstName());
		
		
	}

	
	

}
