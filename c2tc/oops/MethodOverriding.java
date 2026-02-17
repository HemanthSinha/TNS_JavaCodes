package org.tns.capgemini.c2tc.oops;

class Animal3
{
	void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}
class Dog3 extends Animal3
{
	void makeSound()
	{
		System.out.println("Dog barks");
	}
}
class Cat3 extends Animal3
{
	void makeSound()
	{
		System.out.println("cat meows");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		Animal3 myAnimal=new Animal3();
		Animal3 mydog=new Dog3();
		Animal3 mycat=new Cat3();
		myAnimal.makeSound();
		mydog.makeSound();
		mycat.makeSound();
		
		
		
	}

}
