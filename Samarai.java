
public class Samarai extends Human{
	
private Object numberOfSamarai;

//	The Samurai class should have a default health of 200; 
	//a method called deathBlow that attacks an object and decreases its health to 0, 
	//but also halves the Samurai's health; a method called meditate which heals the 
	//Samurai back to full health; and a method called howMany that returns the 
	//current number of Samurai.

	public Samarai() {
		super();
		this.health = 200;
	}
	public void deathBlow() {
		this.health = this.health - this.health;
		System.out.println("And I'm dead. " + this.health);
		//how to half samarai's health...?
	}
	
	public void meditate() {
		this.health = 200; 
		System.out.println("Back to life! " + this.health);
				//return to full health?
	}
	
	public void howMany() {
		//not sure what this would be, as I didn't see where there was more than 1 samarai
		int numberOfSamarai = 3;
		System.out.println(numberOfSamarai);
	}
}
