package vr222ed_assign3;

import java.util.Random;
import java.util.Scanner;

public class GameManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eyy ey = new eyy();
		ey.game();
		
	}

}
class eyy {
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	String state = "start";
	Monster monster = new Monster();
	Hero hero = new Hero();
	weapon newy = new weapon();

	
	public void game() {
		if (hero.getXp() != 0) {
		switch (state) {
		
			case "start":
				initialize();
				break;
			case "exploring":
				explore();
				break;
			case "encounter": 
				encounter();
				break;
			case "playerturn": 
				playerTurn(); 
				break;
			case "weapon":
				weapon();
				break;
			case "enemyturn": 
				enemyTurn(); 
				break;
			case "win":
				win();
				break;
			case "lose":
				lose(); 
				break;
			
		}
		}
		else {System.out.println();}
		
	}

	
	
	
	private void weapon() {
		// TODO Auto-generated method stub
		 newy = new weapon();
		System.out.println("How lucky! You found " + newy.name + " and it has " + newy.power + " power, your current weapon has " + hero.Weapon.power );
		System.out.println("Do you want to keep it? y/n");
		String choice = s.nextLine();
		if (choice.charAt(0) == 'y') {
			hero.Weapon = newy;
			System.out.println("Congrats! Your wepaon now is" + hero.Weapon.name);
			state = "exploring"; game();
		}
		else if (choice.charAt(0) == 'n') {
			System.out.println("you leave the weapon and keep exploring");
			state = "exploring"; game();
		}
	}




	public void initialize() {
		System.out.println("Please bless thy hero with a Christian name");
		hero = new Hero(s.nextLine());
		System.out.println("Hello " + hero.getName() + ", you will face many dangers ahead but you must never lose hope!");
		state = "exploring";
		game();
	}
	
	public void explore() {
		int chance = r.nextInt(101);
		System.out.println(chance);
		if (chance<50) //50% 
		{System.out.println("You wander in the maze, aimlessly"); explore();}
		if (chance<60 && chance >50) //10% 
		{System.out.println("Huzzah! You found a weapon"); state = "weapon"; game();}
		if (chance<100 && chance >60) //40%
		{System.out.println("An enemy approaches..."); state = "encounter"; game(); }
	}
	
	public void encounter() {
		monster = new Monster();
		System.out.println("You encounter a monster! He faces you with his " + monster.Weapon.name + " and says: ");
		monster.present();
		state = "playerturn"; game();
	}
	
	public void playerTurn() {
		int monsterdef = monster.attemptDefense();
		int heroattack = hero.attemptDamage();
		if (monsterdef<heroattack) {
			System.out.println("Your attack of " + heroattack + " damage penetrated the monsters' defense of " + monsterdef );
			int damage = hero.inflictDamage();
			System.out.println("You strike the fiend and inflict " + damage + " damage");
			monster.xp = monster.xp - damage;
			if (monster.xp<=0) {
				state = "win"; game(); //implement
			}
			else { state = "enemyturn"; game();}// implement
		}
		else {System.out.println( "Your puny attack of " + heroattack + " damage was not very effective against his armor of " +monsterdef);
		state = "enemyturn"; game(); // implement
		}
	}
	
	public void enemyTurn() {
		int monsteratk = monster.attemptDamage();
		int herodefense = hero.defend();
		if (herodefense<monsteratk) {
			System.out.println("He strikes with " + monsteratk + "and your armor of " + herodefense + " gives way to the blow" );
			int damage = monster.inflictDamage();
			System.out.println("The fiend strikes you and inflicts " + damage + "damage");
			hero.xp = hero.xp - damage;
			System.out.println(hero.xp);
			if (hero.xp<=0) {
				state = "lose"; game(); //implement
			}
			else { state = "playerturn"; game();}// implement
		}
		else {System.out.println( "His arm wobbles, inflicting only " + monsteratk + " which do nothing against your " +herodefense + " steel ab(s)");
		state = "playerturn"; game(); // implement
		}
	}
	

	private void lose() {
		// TODO Auto-generated method stub
		System.out.println("As the enemy strikes you, your vision fades to black, your lifeless body falls to the ground but not to worry, soon a new hero will seek your fate");
		System.out.println("good bye!");
		 
	}

	private void win() {
		// TODO Auto-generated method stub
		System.out.println("You have bested the fiend! Hoo-ah! You march on..");
		state = "exploring";
		game();
	}
	

}
