package inheritance.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		Monster monster = new Monster();
		monster.atack = 10;
		monster.health = 100;
		monster.showInfo();
		monster.attacking();
		
		Slime slime = new Slime();
		slime.atack = 30; 
		slime.health = 200; 
		slime.skill = "마비";
		slime.showInfo(); 
		slime.attacking(); 
		slime.skillAttack();
	}

}

// 몬스터
class Monster {
	int atack; // 공격력
	int health;
	
	public void attacking() {
		System.out.println("몬스터가 " + atack + "만큼 공격했다");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + atack + "이고 체력은" 
				+ health + "이다");
	}
}

// 슬라임 몬스터
class Slime extends Monster {
	String skill; // 스킬
	
	public void skillAttack() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
	}
}




