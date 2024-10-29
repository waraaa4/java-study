package abstractex.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata();
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnoff();

		Avante avante = new Avante();
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnoff();
		
	}

}

abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
}

class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다");
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다");
	}
	
}

class Avante extends Car {

	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다");
	}

	@Override
	public void turnoff() {
		System.out.println("Avante 시동을 끕니다");
	}
	
}





