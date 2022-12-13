package org.upcasting;

public class Parent {
	int age;

	void show(){
		System.out.println("method is Parent ");
	}
}

class Child extends Parent{
	int salary;


	void show2() {
		System.out.println("method is Child");
	}
}
