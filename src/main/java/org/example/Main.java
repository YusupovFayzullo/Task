package org.example;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		boolean b[]=new boolean[-200];


		String fayz = "asaswlhjhjhjhwhljhjwhllkjklw";
		StringTokenizer stringTokenizer = new StringTokenizer(fayz, "w", false);
		while (stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextToken());
		}
		Set<Integer> integerSet = new HashSet<>();


		int matches[][] = {{2, 3}, {1, 3}, {5, 4}, {6, 4} };

		List<List<Integer>> winners = Solution.findWinners(matches);

		System.out.println("winners = " + winners);

	}
	 class Solution {

		public  static List<List<Integer>> findWinners(int[][] matches) {
			Set<Integer> winners = new HashSet<>();
			List<Integer> losers = new ArrayList<>();
			List<Integer> onlyWinners = new ArrayList<>();
			List<Integer> onceLost = new ArrayList<>();

 			for (int i = 0; i < matches.length; i++) {
				winners.add(matches[i][0]);
				losers.add(matches[i][1]);
			}
			 winners.removeAll(losers);
			 for (int i = 0; i < losers.size(); i++) {
				 int frequency = Collections.frequency(losers, losers.get(i));
				 if (frequency == 1){
					 onceLost.add(losers.get(i));
				 }
			 }
				onlyWinners.addAll(winners);
			List<List<Integer>> result = new ArrayList<>();

			 Collections.sort(onceLost);
			 Collections.sort(onlyWinners);
			result.add(onlyWinners);
			 result.add(onceLost);
			 return result;
		}
	}

	public final  static void m1(){
		System.out.println();
	}

}