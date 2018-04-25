
public class Wizard extends Human {
	public Wizard() {
		this.setIntelligence(8);
		this.setHealth(50);
	}
	public Wizard(String name) {
		this.setName(name);
		this.setIntelligence(8);
		this.setHealth(50);
	}
	public void heal(Human hum) {
		Integer heals = this.getIntelligence();
		hum.adjustHealth(heals);
		System.out.println(this.getName() + " healed " + hum.getName() + " by " + heals + " health points.");
	}
	public void fireball(Human hum) {
		Integer dmg = this.getIntelligence() * 3;
		hum.adjustHealth(-dmg);
		System.out.println(this.getName() + " used Fireball on " + hum.getName() + " and did " + dmg + " points of damage.");
	}
}
