package com.chatApp.client;
import java.util.List;
import java.util.Scanner;
//import com.chatApp.Dao.BookDAO;
import com.chatApp.Dao.BookDAOImp;
import com.chatApp.app.Book;
public class BookApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		boolean flag=true;
		BookApp b= new BookApp();
		// List all books
		System.out.println("Listing all Books:");
		 b.findAllBooks();
		 System.out.println();
		 // search book by keyword
		 
		 System.err.println("enter keyword  to Search book or enter 'exit' to exit");
		do{
			String keyword=sc.nextLine();
			if("exit".equals(keyword)){
				 flag=false;
				 break;
			 }
			 b.searchBooks(keyword);
			 System.out.println();
			 
		}while(flag);
		
		
		}

	BookDAOImp bookdao= new BookDAOImp();
		private  void findAllBooks() {
		
		 List<Book> books = bookdao.findAllBooks();
		 for (Book book : books) {
		System.out.println(book);
	 }
		}		 
		 private  void searchBooks(String keyWord) {
			 List<Book> books = bookdao.searchBooksByKeyword(keyWord);
			  for (Book book : books) {
			  System.out.println(book);
			  }
	

}
		}
