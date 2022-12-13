package org.example.task.string;

import java.io.Console;

public class Task1 {
	public static void main(String[] args) {

		Console console = System.console();
		String s="123"; // faqat String pool da yaratiladi

		String s2="123";
		String s1=new String("123");  // ham string poolda ham heap xotirada joylashadi

//		System.out.println(s==s1);
//		System.out.println(s==s2);


//		String intern = s1.intern();
//		System.out.println(intern==s2);

		String season="autumn";

		 switch (season){
			case "spring"-> System.out.println("bahor");
			case "autumn" -> System.out.println("kuz");
			case "winter" -> System.out.println("qish");
			case "summer" -> System.out.println("yoz");
			default -> System.out.println("Bunday fasul yo'q");
		};


	}

}
