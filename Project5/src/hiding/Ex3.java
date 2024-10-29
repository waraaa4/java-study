package hiding;

public class Ex3 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("이름");
		person.setHeight(0);
		person.setWeight(0.1);
		
		System.out.println("이름:" + person.getName());
		System.out.println("키" + person.getHeight());
		System.out.println("몸무게:" + person.getWeight());
		
	}

}

class Person {
	private String name; // 이름
	private int height; // 키
	private double weight; // 몸무게
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}



