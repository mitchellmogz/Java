
public class PersonalDemo {

	public static void main(String[] args) {
		
		Personal box1 = new Personal();
		Personal box2 = new Personal();
		Personal box3 = new Personal();
		
		box1.setName("Mitchell Mugele");
		box1.setAddress("208 Plum Lane");
		box1.setAge(21);
		box1.setPhone("618-223-9746");
		
		box2.setName("Cortney Karban");
		box2.setAddress("203 Dwight Street");
		box2.setAge(21);
		box2.setPhone("618-978-2013");
		
		box3.setName("Ryan Bahl");
		box3.setAddress("123 Hillside Drive");
		box3.setAge(20);
		box3.setPhone("618-791-1045");
		
		System.out.println("The first personal contact is " + box1.getName() +
		". His address is " + box1.getAddress() + ". He is " + box1.getAge() +
		" years old and his phone number is " + box1.getPhone() + "." );
				
		System.out.println("The second personal contact is " + box2.getName() +
		". Her address is " + box2.getAddress() + ". She is " + box2.getAge() +
		" years old and her phone number is " + box2.getPhone() + "." );
		
		System.out.println("The third personal contact is " + box3.getName() +
		". His address is " + box3.getAddress() + ". He is " + box3.getAge() +
		" years old and his phone number is " + box3.getPhone() + "." );
	}

}
