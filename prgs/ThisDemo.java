package Tns;

class Person
{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}

	public void displayDetails() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Aman");
		person.setAge(21);
		person.displayDetails();
		person.setName("Gourav");
		person.setAge(23);
		person.getName();
		person.getAge();
		person.displayDetails();
	}

}
