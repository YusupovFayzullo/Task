package org.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1380 {

	public static void main(String[] args) {

		int matrix[][]={{3,7,8},{9,11,13},{15,16,17}};

		int[] mins = new int[matrix.length];
		int[] maxs = new int[matrix[0].length];

		Arrays.fill(mins, Integer.MAX_VALUE);
		Arrays.fill(maxs, Integer.MIN_VALUE);



		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				mins[i] = Math.min(matrix[i][j], mins[i]);
				maxs[j] = Math.max(matrix[i][j], maxs[j]);
			}
		}

		for (int min : mins) {
			System.out.print(min+" ");
		}
		System.out.println();
		System.out.println("Max: ");

		for (int max : maxs) {
			System.out.print(max+" ");
		}



		List<Integer> res = new ArrayList<>();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				int ele = matrix[i][j];
				if(ele == mins[i] && ele==maxs[j]){
					res.add(ele);
				}
			}
		}

		System.out.println("res = " + res);



	}
}
