
public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon poke = new Pokemon(name, health, type);
		return poke;
	}
	public void attackPokemon(Pokemon poke) {
		poke.setHealth(poke.getHealth() - 10);
	}
}