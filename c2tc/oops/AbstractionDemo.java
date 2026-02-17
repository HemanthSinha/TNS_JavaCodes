package org.tns.capgemini.c2tc.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		MaheshDemo obj= new SureshDemo();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMonitoring();

	}

}

abstract class MaheshDemo  //2014 can't create a object for this class //abstract class
{
	public void calling()
	{
		System.out.println("calling");
	}
	public abstract void AIIntegration();//abstract method
	public abstract void SatelliteComm();
	public abstract void HealthMonitoring();
	
}
abstract class  RameshDemo extends MaheshDemo    //2015 abstract class
{
	public void AIIntegration()
	{
		System.out.println("Phone is integration with AI");
	}
}
class SureshDemo extends RameshDemo   //2016  // concrete class
{
	public void SatelliteComm() //concrete method
	{
		System.out.println(" Phone is integrated with satelitecomm");
	}
	public void HealthMonitoring()
	{
		System.out.println(" Phone is integrated with HealthMonitoring");
	}
}