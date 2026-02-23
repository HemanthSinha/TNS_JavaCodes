package Tns;

public class VariableDemo {
		int cost=10;//instance var
		
		void print()
		{
			String msg="Hello";//local var
			System.out.println(msg);
		}
	static String message="Hello students ";//static var
	
	
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.cost);
		obj.print();
		System.out.println(message);

	}

}
