package SpringCorePractice.SpringCorePracticeDemo;

public class Address {
	private String city;
	private String state;
	private String country;
	
	Address(String city, String state, String country){
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	 @Override
    public String toString() {
        return "City: " + city + ", State: " + state + ", Country: " + country;
    }
    
//	public void displayInfo(){  
//	    System.out.println("City: "+city);  
//	    System.out.println("State: "+state);
//	    System.out.println("Country: "+country);    
//	}  
}
