package address.book;

public class Main {
	public static void main(String[] args) {
		System.out.println("Wellcome to Address Book program.");

		Contact storeValue = new Contact("john", "kennedy", "Gauhati", "Assam", "xyz14@gmail.in", 78325, 100);
		storeValue.Display();

		AddContact displayContact = new AddContact();
		displayContact.add();
		
		AddContact editedContact = new AddContact();
		editedContact.edit();
		//displayContact.NewContact();
	}
}