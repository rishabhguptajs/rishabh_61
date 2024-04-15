package rishabh_61_lab1;

class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("The name is " + name + ", and the age is " + age);
	}
}

public class Q1 {
	public static void main(String[] args) {
		Person p1 = new Person("Rishabh", 18);
		Person p2 = new Person("Gupta", 18);
		
		p1.display();
		p2.display();
	}
}
