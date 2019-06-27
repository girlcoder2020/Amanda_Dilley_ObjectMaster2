public class Ninja extends Human {
	
//	The Ninja class should have a default stealth of 10; 
	//a method, steal, that takes health from another human by their stealth level, 
	//and a way to run away that decreases their health by 10.

	protected int stealth;
	
	public Ninja() {
		super();
		this.stealth = 10;
	}
	
	public void steal() {
		this.health = this.health - this.stealth; //minus 3
		System.out.println("Finders, keepers " + this.health);
	}
	
	public void runAway() {
		this.health = this.health - 10;
		System.out.println("Ok, bye bye now! " + this.health);
	}
	
}