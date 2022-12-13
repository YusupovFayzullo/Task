package org.variable_hiding_shadowing;

public class VariableHiding {

	protected String name="Parent name";

	public void print(){
		System.out.println(name);
	}

	public static void main(String[] args) {
		VariableHiding t=new Test();
		t.print();
	}

}

class Test extends VariableHiding{

	 protected String name="Child name";

	@Override
	public void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
