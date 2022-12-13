package org.composition;

public class Car {

	private final String name;

	private final Engine engine; // com

	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", engine=" + engine +
				'}';
	}

	public static void main(String[] args) {

		Car c=new Car("spark",new Engine("dfgf",200));

		System.out.println("c = " + c);
	}
}

class Engine{

	private String model;
	private int horsePower;

	public Engine(String model, int horsePower) {
		this.model = model;
		this.horsePower = horsePower;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine{" +
				"model='" + model + '\'' +
				", horsePower=" + horsePower +
				'}';
	}
}
