/**
 * Homework 8 - Creates an instance of the Car, Driver and Address classes, properly links them together, and displays information from the classes
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 09Jul2018
 */

public class TestingClass {

	public static void main(String[] args) {
		//The following line could be performed to forego all the set lines but the assignment seemed to indicate that the seperate classes 
		//needed to be created manually and linked together.
		//Car car = new Car(1969, "Chevrolet", "Camero", "445696653", "Jay Leno", "2202 E. 93rd St.", "Chicago", "IL", "60617");
		
		//Create and set attributes for the Address class variable
		Address address = new Address();
		address.setStreetAddress("2202 E. 93rd St.");
		address.setCity("Chicago");
		address.setState("IL");
		address.setZipcode("60617");
		
		//Create and set attributes for the Driver class variable
		Driver driver = new Driver();
		driver.setLicenseId("445696653");
		driver.setFullName("Jay Leno");
		driver.setAddress(address);
		
		//Create and set attributes for the Car class variable
		Car car = new Car();
		car.setYear(2018);
		car.setMake("Lamborghini");
		car.setModel("Huracan");
		car.setDriver(driver);
		
		//Use stringBuilder to display the data
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Car:       ");
		stringBuilder.append(car.getYear() + " ");
		stringBuilder.append(car.getMake() + " ");
		stringBuilder.append(car.getModel() + "\n");
		stringBuilder.append("Owned by:  ");
		stringBuilder.append(car.getDriver().getFullName() + "\n");
		stringBuilder.append("           ");
		stringBuilder.append(car.getDriver().getAddress().getStreetAddress() + "\n");
		stringBuilder.append("           ");
		stringBuilder.append(car.getDriver().getAddress().getCity() + ", ");
		stringBuilder.append(car.getDriver().getAddress().getState() + " ");
		stringBuilder.append(car.getDriver().getAddress().getZipcode() + "\n");
		
		System.out.println(stringBuilder);
	}

}
