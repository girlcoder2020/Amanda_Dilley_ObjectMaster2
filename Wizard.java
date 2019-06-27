
public class Wizard extends Human{
//	The Wizard class should have a default health of 50 and intelligence of 8; 
	//a method called heal that heals whomever it was cast on for an amount equal to 
	//the wizard's intelligence; and a method called fireball that decreases the health 
	//of whichever object it attacked by 3 * the wizard's intelligence.

	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal() {
		this.health = this.health + 8;
		System.out.println("I am healed! " + this.health);
	}
	
	public void fireBall() {
		this.health = this.health - 24;
		System.out.println("Burn! Ouch! Burn! " + this.health);
	}
	
}
