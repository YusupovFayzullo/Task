package org.upcasting;

public class Main {
	public static void main(String[] args) {

		Parent p=new Child();
		//  p.show();

		Child child=(Child) p;
		child.show();



		Child child1=new Child();

		child1.show();









	}
}
