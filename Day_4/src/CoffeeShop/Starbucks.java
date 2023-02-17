package CoffeeShop;

public class Starbucks extends CustomerManager {
	
	private ICustomerCheckService customerCheckService;
	  
	public Starbucks(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void Save(Customer customer) {
	 
		if (customerCheckService.CheckIfRealPerson(customer)){
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}


	
	

}
