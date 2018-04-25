
public class DDTest {
	public static void main(String[] args) {
		Wizard jojen = new Wizard("Jojen");
		Ninja yoko = new Ninja("Yoko");
		Samurai kenshin = new Samurai("Kenshin");
		Human bob = new Human();
		Human rob = new Human();
		bob.setName("Bob");
		rob.setName("Rob");
		bob.attack(yoko);
		jojen.heal(yoko);
		kenshin.deathBlow(bob);
		yoko.steal(rob);
		rob.attack(kenshin);
		kenshin.meditate();
		jojen.fireball(rob);
		yoko.runAway();
		System.out.println(kenshin.howMany());
	}
}
