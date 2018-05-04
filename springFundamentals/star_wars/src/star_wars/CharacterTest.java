package star_wars;

public class CharacterTest {
	public static void main(String[] args) {
		Character obi = new Character("Obi-Wan Kenobi", 38, "Only a Sith deals in absolutes; I will do what I must.");
		Character ani = new Character("Anakin Skywalker", 23, "I don't like sand!");
		System.out.println(obi.greetCharacter(ani));
		System.out.println(ani.getFamousSaying());
		System.out.println(obi.getFamousSaying());
		Character asohka = new Character("Ahsoka Tano", 16, "“Good grief, Rex");
		Character plokoon = new Character("Plo Koon", 99, "Don’t shoot, or they’ll panic.");
		Character han = new Character("Han Solo", 29, "I have a bad feeling about this.");
		Character greedo = new Character();
		greedo.setName("Greedo");
		greedo.setAge(35);
		greedo.setFamousSaying("Going somewhere, Solo?");
		System.out.println(greedo.greetCharacter(han));
		System.out.println(han.getFamousSaying());
		System.out.println(greedo.getFamousSaying());
	}
}
