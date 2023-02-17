package CoffeeShop;


public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new Starbucks(new MernisServiceAdapter());
		
    	customerManager.Save(new Customer (111111, "Ece", "Çabukçu", 2001,"Turkey"));
		System.out.println();
		

	}


}
