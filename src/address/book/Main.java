package address.book;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("Wellcome to Address Book program.");

		Contact storeValue = new Contact("john", "kennedy", "Gauhati", "Assam", "xyz14@gmail.in", 78325, 100);
		storeValue.Display();

		AddContact displayContact = new AddContact();
		displayContact.add();
		
		
		displayContact.edit();
		List values = displayContact.list;
		System.out.println("List after edit: " + values);
		displayContact.delete();
		List valuesAfterDelete = displayContact.list;
		System.out.println("List After Deletion: " + valuesAfterDelete);
		
	
	}
}