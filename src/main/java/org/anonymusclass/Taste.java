package org.anonymusclass;

public class Taste {
	public static void main(String[] args) {


		Fruit f=new Fruit()   // anonymous class

		{

			public void show() {
				System.out.println("Anonymous class..");
			}
		};

		f.show();


		Fruit f2=new Fruit();

		f2.show();
	}
}
