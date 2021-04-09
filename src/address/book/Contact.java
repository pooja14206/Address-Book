package address.book;

import java.util.Scanner;

public class Contact{
		String firstName;
		String lastName;
		String city;
		String state;
		String email;
		int zip;
		int phoneNo;
		
		public Contact(String firstName, String lastName, String city, String state, String email, int zip, int phoneNo) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.city = city;
			this.state = state;
			this.email = email;
			this.zip = zip;
			this.phoneNo = phoneNo;
		} 
		
		public void Display() {
			System.out.println("First Name: " + this.firstName);
			System.out.println("Last Name: " + this.lastName);
			System.out.println("City: " + this.city);
			System.out.println("State: " + this.state);
			System.out.println("Zip: " + this.zip);
			System.out.println("Phone Number: " + this.phoneNo);
			System.out.println("EmailId: " + this.email);
		}
		
		public void NewContact(){
			Scanner newData = new Scanner(System.in);   
			System.out.println("Add a new Contact to ADDRESS BOOK:------");
			System.out.print("First Name: ");  
			String firstName= newData.nextLine();  
			System.out.print("Last Name: ");  
			String lastName= newData.nextLine();  
			System.out.print("City: ");  
			String city= newData.nextLine();
			System.out.print("State: ");  
			String state= newData.nextLine();
			System.out.print("EmailID: ");  
			String email= newData.nextLine();
			System.out.print("Zip: ");  
			int zip= newData.nextInt();
			System.out.print("PhoneNumber: ");  
			int phoneNo= newData.nextInt();
			System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nCity: " + city + "\nState: " + state + "\nZip: " + zip + "\nPhone Number: " +phoneNo + "\nEmailID: " + email);
			
			newData.close(); //to stop worning:resource lake newdata is never closed(not close Scanner)
		}  
			
}