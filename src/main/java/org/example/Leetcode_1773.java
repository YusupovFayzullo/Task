package org.example;

public class Leetcode_1773 {
	public static void main(String[] args) {


	}

	class Solution {
		public int[][] shiftGrid(int[][] grid, int k) {

			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if(k>grid[i].length){
						grid[i][j]=grid[i][j+k];
					}
					else {
						grid[i][j]=grid[k-j][j];
				  }
				}
			}
			return grid;
		}
	}

//	class Solution {
//
//		public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//          int count=0;
//
//			  for (int i = 0; i < items.size(); i++) {
//				  if(ruleKey.equals("type")){
//				   if(items.get(i).get(0).equals(ruleValue)) count++;
//
//				  }
//				  if(ruleKey.equals("color")){
//					  if(items.get(i).get(1).equals(ruleValue)) count++;
//				  }
//				  if(ruleKey.equals("name")){
//					  if(items.get(i).get(2).equals(ruleValue)) count++;
//				  }
//
//
//		  }
//			  return count;
//		  }
//	}
}
