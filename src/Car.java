/**Contains the attributes, constructors and methods for the Car class
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 09Jul2018
 *
 */

public class Car {
	//Declare attributes
	private int year = 1990;
	private String make = "Toyota";
	private String model = "Carola";
	private Driver driver;
	
	//Constructors
	public Car() {
		this.driver = new Driver("1234567890", "Jane Doe", "133 Main Ave.", "Chinatown", "IL", "60601");
	}
	
	public Car(int year, String make, String model, String licenseId, String fullName, String streetAddress, String city, String state, String zipcode) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.driver = new Driver(licenseId, fullName, streetAddress, city, state, zipcode);
	}
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * @return the driver
	 */
	public Driver getDriver() {
		return driver;
	}
	
	/**
	 * @param driver the driver to set
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
}
