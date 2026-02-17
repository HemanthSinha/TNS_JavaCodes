package org.tns.capgemini.c2tc.streamapi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;

public class AllTerminalOps {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(3,6,8,3,9,5,7);
		
		//foreact -print each number
		
		System.out.println("Numbers printed using foreach");
		numbers.stream().forEach(n->System.out.print(n + " "));
		System.out.println();
		
		//toArray - convert stream to array
		
		Integer[] array=numbers.stream().toArray(Integer[]::new);
		System.out.println("Array" + Arrays.toString(array));
		
		//reduce -sum of all numbers
		int sum1=numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum of numbers " + sum1);
		
		//collect -collect to list after filtering
		List<Integer> uniquenumber=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		
		//min -find the min number
		
		Optional<Integer> min1=numbers.stream().min(Integer::compareTo);
		min1.ifPresent(value->System.out.println("Minimun number " + value));
		
		// max -find the max number
		
		Optional<Integer> max1=numbers.stream().max(Integer::compareTo);
		max1.ifPresent(value->System.out.println("Maximum number " + value));
		
		//count - count of numbers
		
		  long count =numbers.stream().count();
		  System.out.println("count of numbers " + count);
		
		  
		  //anymatch -check if any number is greater than 6
		  
		  boolean anygreaterthan=numbers.stream().anyMatch(n->n>6);
		 System.out.println("any number greater than 6 " + anygreaterthan);
		 
		 //allMatch -check if all numbers are positive
		 
		 boolean allpositive =numbers.stream().allMatch(n->n>0);
		 System.out.println("No number are negative " +allpositive );
		 
		 //noneMatch -check if no number is negative
		 
		 boolean nonenegative =numbers.stream().noneMatch(n->n<0);
		 System.out.println("no number are nergative " +nonenegative);
		 
		 //findfirst ->find the first element
		 
		 Optional<Integer> first=numbers.stream().findFirst();
		 first.ifPresent(value->System.out.println("first number " + value));
		 
		 Optional<Integer> any=numbers.stream().findAny();
		 any.ifPresent(value->System.out.println("any number " + value));
		 
		 
	}

}
