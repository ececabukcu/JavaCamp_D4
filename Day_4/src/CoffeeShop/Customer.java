package CoffeeShop;



public class Customer {
	
	private int Id;
	private String FirstName;
	private String LastName;
	private int DateOfBirth;
	private String Nationality;
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationality) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Nationality = nationality;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

}
