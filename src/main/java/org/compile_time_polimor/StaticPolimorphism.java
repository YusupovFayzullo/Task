package org.compile_time_polimor;

public class StaticPolimorphism {


	 void sum (int a, int b){
		System.out.print(a+b);
	}

	public static void main(String[] args) {



		 String s="Hi";  //  scp
		System.out.println("s.hashCode() = " + s.hashCode());
		s=s.concat(" Guys");

		System.out.println("s = " + s);

		String s1=new String("egfgur"); //
	}

}

class B extends StaticPolimorphism {


	@Override
	void sum(int a, int b) {
		System.out.println(a-b);
	}
}
