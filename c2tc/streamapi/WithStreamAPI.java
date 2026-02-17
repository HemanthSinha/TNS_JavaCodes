package org.tns.capgemini.c2tc.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class WithStreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream() // Step 1: Create a stream from the list
                                      .filter(n -> n % 2 == 0)  // Intermediate Operation: Keep only even numbers
                                      .map(n -> n * 2)          // Intermediate Operation: MULTIPLY the even number with 2
                                      .sorted()                 // Intermediate Operation: Sort the numbers
                                      .collect(Collectors.toList()); // Terminal Operation: Collect results into
        //a list
 System.out.println(result); // Output: [4, 8, 12, 16, 20]
    }
}
