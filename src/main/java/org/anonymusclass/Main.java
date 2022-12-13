package org.anonymusclass;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Integer> list=List.of(1,2,3,4,5,56,13,5,7);


		List<Integer> evenNumbers = list.stream().filter(integer -> integer % 2 == 0).toList();

		evenNumbers.forEach(System.out::println);

	}
}
