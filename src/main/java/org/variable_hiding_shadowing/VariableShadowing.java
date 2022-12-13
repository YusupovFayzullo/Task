package org.variable_hiding_shadowing;

public class VariableShadowing {

	private String name="Umid";
	private int age=21;

	public static void main(String[] args) {
        VariableShadowing v=new VariableShadowing();

		v.print();

	}

	public void print(){
		String name="Komil";
		int age=22;


		System.out.println(this.name);
		System.out.println(this.age);
	}
}
