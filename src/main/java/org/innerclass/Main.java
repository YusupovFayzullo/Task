package org.innerclass;

public class Main {

	public static void main(String[] args) {



		OuterClass out=new OuterClass();


		OuterClass.Inner i=new OuterClass.Inner();

		i.m1();


		System.out.println("out.name = " + out.name);

		out.outerClass();



	}
}
