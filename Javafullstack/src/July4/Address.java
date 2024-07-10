package July4;

public class Address {
	
	private String city;
	private String state;
	private String pincode;
	
	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		if(city.equals("Bhopal")) {
			System.out.println("can't set");
		}else {
			this.city = city;
		}
	}
}
	
	
	
	