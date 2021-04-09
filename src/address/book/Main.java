package address.book;

public class Main {
	public static void main(String[] args) {
		System.out.println("Wellcome to Address Book program.");
		
		Contact storeValue = new Contact("john", "kennedy", "Gauhati", "Assam", "xyz14@gmail.in", 78325, 100);
		storeValue.Display();
		
		Contact enter = new Contact(null,null,null,null,null,0,0);
		enter.NewContact();
		
		
	}
}