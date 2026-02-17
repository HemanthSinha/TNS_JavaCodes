package org.tns.capgemini.c2tc.oops;

class Animal2
{
	void eat()
	{
		System.out.println("Animal IS EATING ");
	}
}

class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is barking");
		
	}
}
class Cat extends Animal2
{
	void meow()
	{
		System.out.println("cat is meowing");
	}
}
class Elephant extends Animal2
{
	void trumpet()
	{
		System.out.println("elephant is trumpeting ");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog2 dog=new Dog2 ();
		Cat cat=new Cat();
		Elephant ele=new Elephant();
		
		dog.eat();
		cat.eat();
		ele.eat();
		
		dog.bark();
		cat.meow();
		ele.trumpet();
		

	}

}
