package org.tns.capgemini.c2tc.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllIntermediateOps {

	public static void main(String[] args) {
		
		//intial list of numbers
	List<Integer> numbers=Arrays.asList(1,2,2,3,4,5,5,6,7,8,9);
	
	//1 map() : multiple each number by 2
	List<Integer> doubled=numbers.stream()
			.map(n->n*2)
			.collect(Collectors.toList());
	System.out.println("Doubled  " +doubled );
	
	
	
	//2 filter() : keep only even numbers
	List<Integer> evens=numbers.stream()
			.filter(n->n%2==0)
			.collect(Collectors.toList());
	System.out.println("Even :" +evens);
	

	//3 distinct() : remove duplicates
	
	List<Integer> uniqueNumbers =numbers.stream()
			.distinct()
			.collect(Collectors.toList());
	System.out.println("uniqueNumbers" + uniqueNumbers);
	
	// 4 sorted() :sort the numbers in ascending order
	
	List<Integer> sortedNumbers =numbers.stream()
			.sorted()
			.collect(Collectors.toList());
	System.out.println("sortedNumbers" + sortedNumbers);
	
	//5 limit() : take only first 5 elements
	List<Integer> LimitedNumbers =numbers.stream()
			.limit(5)
			.collect(Collectors.toList());
	System.out.println("LimitedNumbers" + LimitedNumbers);
	
	//6 skip() : skip the first 3 elements
	List<Integer> Skipumbers =numbers.stream()
			.skip(3)
			.collect(Collectors.toList());
	System.out.println("Skipumbers" + Skipumbers);
	
	
}
}