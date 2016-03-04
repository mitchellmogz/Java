
public class Library {
		
		//Fields
	private Book textBook;
	private String libraryName;
	
		//Constructor
	public Library(String name, Book text)
	{
		libraryName = name;
		textBook = new Book(text);
	}
	
	public Library(String libraryName)
	{
		this.libraryName = libraryName;
	}
	
		//Accessor
	public String getLibraryName()
	{
		return libraryName;
	}
	
	public Book getBook1()
	{
		return new Book(textBook);
	}
	
		//toString
	public String toString()
	{
		String str;
		
			//String describing the item
		str = "The name of the library is " + libraryName + ".\nThe book information:\n " + textBook;
			
			//RETURN
		return str;
	}
}
