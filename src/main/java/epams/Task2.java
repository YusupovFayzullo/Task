package epams;

public class Task2 {
	public static void main(String[] args) {

		Task2 t2=new Task2();

		t2.printGreatest(2,8,1);

	}

	public void printGreatest(int first, int second, int third) {

		int max=(first>second)?first:second;

		//max=max>third?max:third;

		System.out.println(max);

	}


}
