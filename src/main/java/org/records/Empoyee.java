package org.records;

public class Empoyee {
	private String name;
	private double balance;
	private String age;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Empoyee{" +
				"name='" + name + '\'' +
				", balance=" + balance +
				", age='" + age + '\'' +
				'}';
	}
}
