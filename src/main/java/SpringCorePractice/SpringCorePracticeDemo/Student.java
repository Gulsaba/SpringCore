package SpringCorePractice.SpringCorePracticeDemo;

import java.util.List;
import java.util.Map;

public class Student {  
private String name;
private Address addr;
private List<String> phones;
private Map<String, String> map;
  
public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  

Student(Address addr, List<String> phones, Map<String, String> map){
	this.addr = addr;
	this.phones = phones;
	this.map = map;
}
  
public void displayInfo(){  
    System.out.println("Name: "+name);  
    
    System.out.println("Address: "+addr);
    System.out.println("Phones: "+phones);
    System.out.println("Map: "+map);
}  
}  