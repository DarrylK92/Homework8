/**Contains the attributes, constructors and methods for the Address class
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 09Jul2018
 *
 */

public class Address {
	//Declare attributes
	private String streetAddress = "133 Main Ave.";
	private String city = "Chinatown";
	private String state = "IL";
	private String zipcode = "60601";
	
	//Constructors
	public Address() {
		
	}
	
	public Address(String streetAddress, String city, String state, String zipcode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
