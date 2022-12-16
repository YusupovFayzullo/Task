package epams;

public class Task3 {
	public static void main(String[] args) {


		Task3 task3=new Task3();

		task3.isEnglishSymbol(';');


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

}
