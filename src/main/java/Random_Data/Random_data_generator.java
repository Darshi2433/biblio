package Random_Data;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

public class Random_data_generator {

	public static void main(String[] args) {
		Fairy fairy = Fairy.create();
		
		Person person = fairy.person();
		
	    person.getFirstName();
		person.getLastName();
		person.getEmail();
		person.getPassword();
		person.getCompany();
		person.getAddress();
		person.getAddress().getCity();
		//person.getAddress().getCountry();
		person.getTelephoneNumber();
		//person.getAddress().getState();
		
		System.out.println("first name : " + person.getFirstName());
		System.out.println("last name : " + person.getLastName());
		System.out.println("email : " + person.getEmail());
		System.out.println("password : " + person.getPassword());
		System.out.println("comapny : " + person.getCompany());
		System.out.println("address : " + person.getAddress());
		System.out.println("phone : " + person.getTelephoneNumber());
		
	}

	

}
