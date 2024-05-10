package gr.atc.training.hashMapList;

public class Address {

	public String address;
	public String city;
	public Coordinates coordinates;
	public String postalCode;
	public String state;
	
	public Address(String address, String city, Coordinates coordinates, String postalCode, String state) {
		this.address = address;
		this.city = city;
		this.coordinates = coordinates;
		this.postalCode = postalCode;
		this.state = state;
	}
	
	
}
