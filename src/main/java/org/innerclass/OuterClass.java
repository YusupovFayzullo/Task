package org.innerclass;

public class OuterClass {

	 int outer=4;
	 String name="Salom";


	void outerClass(){
		System.out.println("Outer class method... ");
	}

	static class Inner{
		double inner=345;
		void m1(){
			System.out.println("static inner class.. ");
		}
	}
}
