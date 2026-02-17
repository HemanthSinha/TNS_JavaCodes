package org.tns.capgemini.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a string");
		char c = scan.next().charAt(1);
		System.out.println("the second character of the input string is" +"  " +c);
		scan.close();


	}

}
