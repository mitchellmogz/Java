
public class Book {

		//Fields
	private String bookName;
	private String publishDate;
	private String author;
	
		//Constructor
	public Book(String bookName, String publishDate,String author)
	{
		this.bookName = bookName;
		this.publishDate = publishDate;
		this.author = author;
	}
	
	public Book(Book object2)
	{
		bookName = object2.bookName;
		publishDate = object2.publishDate;
		author = object2.author;
	}
	
		//Mutator
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	public void setPublishDate(String publishDate)
	{
		this.publishDate = publishDate;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	//toString
		public String toString()
		{
			String str;
			
				//String describing the item
			str = "Title: " + bookName + "\nDate Published: " + publishDate + "\nAuthor Name: " + author;
				
				//RETURN
			return str;
		}
}
