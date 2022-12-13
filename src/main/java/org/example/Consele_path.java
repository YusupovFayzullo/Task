package org.example;

import java.io.Console;
import java.util.Scanner;

public class Consele_path {
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		Console console = System.console();

		String s="123";
		String a=new String("123");

		int i = System.identityHashCode(a);

		System.out.println("i = " + i);

		int i1 = a.hashCode();

		System.out.println("i1 = " + i1);

		String aItern = a.intern();

		System.out.println("aItern = " + aItern);




	}
}
