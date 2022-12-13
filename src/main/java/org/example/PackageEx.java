package org.example;


public class PackageEx {
	public static void main(String[] args) {
		String s="Hello";
		String s2="Hello";
		String s3="Hello";
		String s4="Hello";

		System.out.println("s4 before: "+s4);
		System.out.println("s4.hashCode() before = " + s4.hashCode());
		s4="Good Bye";

		System.out.println("s4 after "+s4);

		System.out.println("s4.hashCode() after = " + s4.hashCode());


		String s5=new String("Good Bye"  );

		System.out.print(s4==s5);

	}
}
