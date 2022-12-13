package org.passing_by_value;

public class Main {
	public static void main(String[] args) {
		Integer a=123;
		int b=3;

		Main main=new Main();

		// main.m(a);

		main.m1(b);


	}

	void m(Integer a){
		a=90;
	}

	void m1(int a){
		a=12;
	}
}
