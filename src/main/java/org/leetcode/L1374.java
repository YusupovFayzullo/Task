package org.leetcode;

public class L1374 {
	public static void main(String[] args) {

		int n=7;


		StringBuilder result=new StringBuilder("");


		if(n%2==0){
			result.append("a");
			n--;
		}


		while (n!=0){
			result.append("b");
			   n--;
		}

		System.out.println(result);


	}
}
