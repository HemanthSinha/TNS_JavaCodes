package org.tns.capgemini.c2tc.oops;


class Animal
{
	String name="Animal";
	void eat()
	{
		System.out.println(name + "  is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println(name +  "  barking");
	}
}

public class SinglelevelInheritance {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.bark();

	}

}
