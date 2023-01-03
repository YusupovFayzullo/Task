package epams;

public class Task1 {
	public static void main(String[] args) {

		Task1 t1=new Task1();
	t1.printGreatest(2,4);
		t1.throwCoin(499);

		t1.tellTheSeasonByMonthNumber(5);


	}

	public void printGreatest(int first, int second) {

		System.out.println(first>second?first:second);

	}

	public void throwCoin(int from1UpTo1000) {
		if(from1UpTo1000<500){
			System.out.println("Eagle");
		}else {
			System.out.println("Tail");
		}

	}

	public void tellTheSeasonByMonthNumber(int month) {

		switch (month){
			case 12,1,2->{
				System.out.println("Winter");
			}
		}

	}


}
