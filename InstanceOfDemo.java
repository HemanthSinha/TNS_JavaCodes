class Person {

}

class Employee extends Person {

}

class Manager extends Employee {

}

public class InstanceOfDemo {

    public static void main(String[] args) {

        Person person = new Person();
        Employee emp = new Employee();
        Manager manager = new Manager();

        System.out.println(emp instanceof Employee); // true
        System.out.println(emp instanceof Person);   // true
        System.out.println(emp instanceof Manager);  // false
    }
}
