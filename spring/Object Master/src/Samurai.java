
public class Samurai extends Human {
	private Integer total;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public void increaseTotal(Integer num) {
		this.total += num;
	}
	public Samurai() {
		this.setHealth(200);
		this.total = 0;
		this.increaseTotal(1);
	}
	public Samurai(String name) {
		this.setName(name);
		this.setHealth(200);
		this.total = 0;
		this.increaseTotal(1);
	}
	public void deathBlow(Human hum) {
		hum.setHealth(0);
		Integer self_dmg = this.getHealth() / 2;
		this.adjustHealth(-self_dmg);
		System.out.println(this.getName() + " used Death Blow. " + hum.getName() + " was killed, and " + this.getName() + " received " + self_dmg + " points of damage.");
	}
	public void meditate() {
		Integer heals = this.getHealth() / 2;
		this.adjustHealth(heals);
		System.out.println(this.getName() + " used Meditate and healed " + heals + " health points.");
	}
	public Integer howMany() {
		return this.total;
	}
}
