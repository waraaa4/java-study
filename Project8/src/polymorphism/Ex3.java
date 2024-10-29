package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		
		moveAnimal(new Human()); // Animal animal = Human()
		moveAnimal(new Tiger()); // Animal animal = Tiger()
		moveAnimal(new Eagle()); // Animal animal = Eagle()

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
