package org.copy;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class Main {
	public static void main(String[] args)  {


		Book b=new Book("Otamdan qolgan dalalar",new Author("Togay Murod"));

		try {
			Book copyBook = (Book) (b.clone());

			copyBook.setTitle("Bobomdan qolgan dalalar");
			System.out.println("b = " + b);
			System.out.println("copyBook = " + copyBook);
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
}
