package org.leetcode;

import java.util.Stack;

public class L20 {

	public static void main(String[] args) {


		boolean a = Character.isLetter('K');

		System.out.println(a);
//		L20 l=new L20();
//
//		System.out.println(l.isValid("(){}}{"));

	}

	public boolean isValid(String s) {


		Stack<Integer> p = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			int q = "(){}[]".indexOf(s.substring(i, i + 1));
			if(q % 2 == 1) {
				if(p.isEmpty() || p.pop() != q - 1) return false;
			} else p.push(q);
		}
		return p.isEmpty();
	}
}
