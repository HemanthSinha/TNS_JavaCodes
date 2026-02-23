package org.tnsif.sf.c2tc.oops;

class Human1
{
	int age;
	String name;
}


public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human1 obj=new Human1();
		System.out.println("Age " +obj.age + " "+ "Name "+obj.name);
		obj.age=26;
		obj.name="hema";
		obj.age=87;
		obj.name="sushma";
		System.out.println("Age " +obj.age + " "+ "Name "+obj.name);
	}

}
