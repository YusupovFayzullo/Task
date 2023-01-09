package epams;

public class Task1 {
	public static void main(String[] args) {


		System.out.println("Fayzullo");
		Task1 t1 = new Task1();
	    t1.printGreatest(2,4);
		t1.throwCoin(499);

		t1.tellTheSeasonByMonthNumber(5);

		t1.tellTheSeasonByMonthNumber(7);


	}

	public void printGreatest(int first, int second) {

		System.out.println(first > second ? first : second);

	}

	public void throwCoin(int from1UpTo1000) {
		if (from1UpTo1000 < 500) {
			System.out.println("Eagle");
		} else {
			System.out.println("Tail");
		}

	}

	public void tellTheSeasonByMonthNumber(int month) {

		switch (month) {
			case 12, 1, 2 -> {
				System.out.println("Winter");
			}
			case 3, 4, 5 -> {
				System.out.println("Spring");
			}
			case 6, 7, 8 -> {
				System.out.println("Summer");
			}
			case 9, 10, 11 -> {
				System.out.println("Autumn");
			}
			default -> System.out.println("Not season in this month");
		}

	}


}
