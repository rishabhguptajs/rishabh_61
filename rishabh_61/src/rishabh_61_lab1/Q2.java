package rishabh_61_lab1;

class Dog{
	String name;
	String breed;
	
	Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public void setBreed(String breed) {
	    this.breed = breed;
	}
	
	public void display() {
		System.out.println("> Dog: " + name + ", Breed: " + breed);
	}
}

public class Q2 {
	public static void main(String[] args) {
		Dog d1 = new Dog("Kuki", "Golden Retriever");
		Dog d2 = new Dog("Dudi", "German Shepherd");
		d1.display();
		d1.setName("PK");
		d1.display();
		
		d2.display();
		d2.setName("Deem");
		d2.setBreed("Labradour");
		d2.display();
	}
}
