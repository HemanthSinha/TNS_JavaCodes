package Tns;

class Course //parent class or base class orsuper class
{
	String courseName="Java ";
	
	void showCourse()
	{
		System.out.println("Course :"+courseName);
	}
}
class Student extends Course //child or derived class or sub class
{
	String studentName="Amit";
	
	void showStudent()
	{
		System.out.println("Student  :"+studentName);
	}
}

public class SingleLevelDemo {

	public static void main(String[] args) {
		Student obj=new Student(); //child class
		obj.showCourse();
		obj.showStudent();
	}

}
