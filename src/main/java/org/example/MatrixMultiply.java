package org.example;



public class MatrixMultiply {
	public static void main(String[] args) {
//		int a=123456789;
//
//		float f=a;
//
//
//		System.out.println("a = " + a);
//		System.out.println("f = " + f);
//		int b= (int) f;
//
//		System
//
//		.out.println("b = " + b);


		System.out.println("finon(4) = " + finon(4));

	}

	public static int  finon(int n){

		if(n==0) return 0;
		else  return finon(n-1)+finon(n-2);
	}
	}



