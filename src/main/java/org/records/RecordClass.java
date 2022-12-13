package org.records;

public record RecordClass(String name, double balance, String age) {

	public RecordClass(String name, double balance, String age){

		if(balance<0){

			new IllegalAccessException("balance cannot be negative");

		}
		this.name=name;
		this.balance=balance;
		this.age=age;
	}
	@Override
	public String name() {
		return name;
	}

	@Override
	public double balance() {
		return balance;
	}

	@Override
	public String age() {
		return age;
	}
	@Override
	public String toString() {
		return "RecordClass{" +
				"name='" + name + '\'' +
				", balance='" + balance + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
