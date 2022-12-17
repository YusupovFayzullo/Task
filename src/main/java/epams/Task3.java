package epams;

public class Task3 {
	public static void main(String[] args) {


		Task3 task3=new Task3();

		// task3.isEnglishSymbol(';');

		task3.isDividableBy5And11(55);


	}

		public void isEnglishSymbol(char symbol) {

		      if(Character.isLetter(symbol)){
				  System.out.println("English");
			  }
			  else{
				  System.out.println("Non English");
			  }

		}

	public void calculateSalary(int salary) {

			if(salary<=10000){
				System.out.println(salary*0.85);
			}else if(salary>10000 && salary<=20000) {

				System.out.println(salary*0.82);
			}else if(salary>20000){
				System.out.println(salary*0.8);
			}
			else if(salary<0){
				System.out.println("wrong input!");
			}
	}

	public void isDividableBy5And11(int number) {

		if(number%55==0){
			System.out.println("Dividable");
		}
		else if(number==0){
			System.out.println("cannot divide by zero");
		}else {
			System.out.println("Non-dividable" );
		}
		System.out.println("Finish");
	}

	public void vowelDeterminer(char character) {
		if(Character.isDigit(character)){
			System.out.println("Digit");
		}else {
			System.out.println("No Digit");
		}

	}

}
