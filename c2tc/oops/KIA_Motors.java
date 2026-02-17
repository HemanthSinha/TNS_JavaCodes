package org.tns.capgemini.c2tc.oops;

public class KIA_Motors {

	int noCar;
	String model;
	String engine;
	int speed;
	
	
	void display()
	{
		System.out.println("This is KIA motors ,welcome to out show room ");
	}
	
	void welcome()
	{
		System.out.println("welcome");
	}
	
	
	public static void main(String[] args) {
		KIA_Motors obj=new KIA_Motors ();
		obj.display();
		obj.welcome();
		obj.noCar=1987;
		obj.model="KIA";
		obj.engine="Smart Stream";
		obj.speed=60;

		System.out.println(obj.noCar);
		System.out.println(obj.model);
		System.out.println(obj.engine);
		System.out.println(obj.speed);
				
	}

}
