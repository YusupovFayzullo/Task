package ml.tasks;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in)
		System.out.print("n=");
		int n=scanner.nextInt();

		if(n<=0){
			System.out.println("Mumkin emas");
			return;
		}

		double w;

		double x_avg=0;
		double x_sum=0;

		double y_avg=0;
		double y_sum=0;



		 int  x[]=new int[n];
		 int  y[]=new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x["+i+"]= ");
			x[i]=scanner.nextInt();
			x_sum+=x[i];

		}

		for (int i = 0; i < n; i++) {
			System.out.print("y["+i+"]= ");
			y[i]=scanner.nextInt();
			y_sum+=y[i];
		}

		x_avg=x_sum/n;
		y_avg=y_sum/n;

		double maxraj=0;
		double surat=0;


		for (int i = 0; i < n; i++) {
			maxraj+=(x[i]-x_avg)*(y[i]-y_sum);
			surat+=(x[i]-x_avg)*(x[i]-x_avg);
		}

		w=maxraj/surat;
		System.out.println("w= "+w);




	}
}
