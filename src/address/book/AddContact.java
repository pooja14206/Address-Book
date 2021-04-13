package address.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddContact {
	String firstName;
	String lastName;
	String city;
	String state;
	String email;
	int zip;
	int phoneNo;
	public void NewContact() {

		Scanner newData = new Scanner(System.in);
		List storeContact = new ArrayList();

		System.out.println("Add 2 new Contact to ADDRESS BOOK:------");
		for (int i = 0; i < 2; i++) {
			System.out.println("First Name: ");
			String firstName = newData.next();
			storeContact.add(firstName);

			System.out.println("Last Name: ");
			String lastName = newData.next();
			storeContact.add(lastName);

			System.out.println("City: ");
			String city = newData.next();
			storeContact.add(city);

			System.out.println("State: ");
			String state = newData.next();
			storeContact.add(state);

			System.out.println("EmailID: ");
			String email = newData.next();
			storeContact.add(email);

			System.out.println("Zip: ");
			int zip = newData.nextInt();
			storeContact.add(zip);

			System.out.println("PhoneNumber: ");
			int phoneNo = newData.nextInt();
			storeContact.add(phoneNo);
			
			System.out.println("FirstName: "+firstName+"\nLastName: "+lastName+"\nCity: "+city+"\nState: "+state+"Email: "+email+"\nZip: "+zip+"\nPhone Number: "+phoneNo);
		}	//System.out.println(storeContact);
	}
}

