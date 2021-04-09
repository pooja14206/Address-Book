package address.book;
import address.book.Contact;

public class Main {
	public static void main(String[] args) {
		System.out.println("Wellcome to Address Book program.");
		
		Contact storeValue = new Contact("john", "kennedy", "Gauhati", "Assam", "xyz14@gmail.in", 78325, 100);
		storeValue.Display();
	}
}