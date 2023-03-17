package org.tnsif.collection;
import java.util.List;
import java.util.Set;
//Program to demonstrate on DI in the form of collection
public class CollectionDemo {
	
	private List<String>contactNo;
	private Set<String>books;
	
	//DI using setters
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void display()
	{
		System.out.println("List Of ContactNo: ");
		for(String contact: contactNo)
		{
			System.out.println(contact);
			
		}
		System.out.println();
		System.out.println("Set of Books: ");
		for(String b: books)
		{
			System.out.println(b);
		}
	}

}
