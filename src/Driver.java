/**Contains the attributes, constructors and methods for the Driver class
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 09Jul2018
 *
 */

public class Driver {
	//Declare attributes
	private String licenseId = "1234567890";
	private String fullName = "Jane Doe";
	private Address address;
	
	//Constructors
	public Driver() {
		this.address = new Address("133 Main Ave.", "Chinatown", "IL", "60601");
	}
	
	public Driver(String licenseId, String fullName, String streetAddress, String city, String state, String zipcode) {
		this.licenseId = licenseId;
		this.fullName = fullName;
		this.address = new Address(streetAddress, city, state, zipcode);
	}
	
	/**
	 * @return the licenseId
	 */
	public String getLicenseId() {
		return licenseId;
	}
	
	/**
	 * @param licenseId the licenseId to set
	 */
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
