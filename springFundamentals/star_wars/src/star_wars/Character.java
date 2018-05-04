package star_wars;

public class Character {
	private String name;
	private Integer age;
	private String famous_saying;
	public Character( ) {
		this.name = "No one";
		this.age = 0;
		this.famous_saying = "May the Force be with you.";
	}
	public Character (String name, Integer age, String saying) {
		this.name = name;
		this.age = age;
		this.famous_saying = saying;
	}
	public String getName() {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}
	public String getFamousSaying() {
		return this.famous_saying;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setFamousSaying(String saying) {
		this.famous_saying = saying;
	}
	public String greetCharacter(Character character) {
		return "Hello, " + character.getName() + " . It's " + this.getName()  + " what are the chances of seeing you again?";
	}
}
