import java.util.Scanner;

public class Aggregation {

	public static void main(String[] args) {
		
			//Variable
		Book book;
		String libraryName;
		String bookName;
		String publishDate;
		String author;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//Test
		System.out.println("Enter the name of the library.");
		libraryName = keyboard.nextLine();
		
		System.out.println("Please enter a Title of the book.");
		bookName = keyboard.nextLine();
			
		System.out.println("Please enter a Published Date of the book.");
		publishDate = keyboard.nextLine();
		
		System.out.println("Please enter an Author of the book.");
		author = keyboard.nextLine();
		

		Book theBook = new Book(bookName, publishDate, author);
		Library theLibrary = new Library(libraryName, theBook);
		
		System.out.println(theLibrary);
		
		keyboard.close();
		
	}

}
