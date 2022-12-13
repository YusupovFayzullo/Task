package org.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L2160 {
	public static void main(String[] args) {
		int n=2932;

		int arr[]=new int[4];


		int i=0;

		while (n!=0){
			arr[i]=n%10;
			n=n/10;
			i++;
		}



		Arrays.sort(arr);


		String s = Arrays.toString(arr);

		System.out.println(s);

		int result;

		int n1=arr[0]*10+arr[2];
		int n2=arr[1]*10+arr[3];

		result=n1+n2;


		System.out.println(result);


	}
}
