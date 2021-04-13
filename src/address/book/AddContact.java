package address.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddContact {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Contact> list = new ArrayList<Contact>();
	Contact person = new Contact();

	public void add() {

		for (int i = 0; i < 2; i++) {
			System.out.println("enter first name");
			String fname = scanner.next();
			person.setFirstName(fname);

			System.out.println("Enter the Last name:");
			String lname = scanner.next();
			person.setLastName(lname);

			System.out.println("Enter the Phone Number:");
			int phone = (int) scanner.nextLong();
			person.setPhoneNo(phone);

			System.out.println("Enter the City:");
			String city = scanner.next();
			person.setCity(city);

			System.out.println("Enter the Zip:");
			int zip = (int) scanner.nextLong();
			person.setZip(zip);

			System.out.println("Enter the State:");
			String state = scanner.next();
			person.setState(state);

			System.out.println("FirstName: " + fname + "\nLastName: " + lname + "\nCity: " + city + "\nState: " + state
					+ "\nZip:" + zip + "\nPhone Number: " + phone);
		}
	}
	
	public void edit() {
		System.out.println("Enter your First name:");
		String fname = scanner.next();

		Iterator<Contact> iterator = list.listIterator();

		while (iterator.hasNext()) {
			Contact person = iterator.next();

			if (fname.equals(person.getFirstName())) {
		
				System.out.println("Choose field you want to add:");
				System.out
						.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Re-Correct your lastname");
					person.setLastName(scanner.next());
					break;
				case 2:
					System.out.println("Re-Correct your Phone Number");
					person.setPhoneNo((int) scanner.nextLong());
					break;
				case 3:
					System.out.println("Re-Correct your City");
					person.setCity(scanner.next());
					break;
				case 4:
					System.out.println("Re-Correct your Zip");
					person.setZip((int) scanner.nextLong());
					break;
				case 5:
					System.out.println("Re-Correct your State");
					person.setState(scanner.next());
					break;
				}

			}
		}

	}
}