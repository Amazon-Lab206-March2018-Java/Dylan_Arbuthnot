
public class PokemonTest {
	public static void main(String[] args) {
		Pokedex dex = new Pokedex();
		Pokemon bulba = dex.createPokemon("Bulbasaur", 60, "Grass");
		Pokemon squirt = new Pokemon("Squirtle", 60, "Water");
		Pokemon charm = dex.createPokemon("Charmander", 60, "Fire");
		Pokemon pika = new Pokemon("Pikachu", 60, "Electric");
		Pokemon mew2 = new Pokemon("Mewtwo", 100, "Psychic");
		System.out.println(dex.pokemonInfo(bulba));
		dex.attackPokemon(mew2);
		System.out.println(dex.pokemonInfo(mew2));
		System.out.println(dex.pokemonInfo(pika));
		dex.attackPokemon(squirt);
		dex.attackPokemon(charm);
		System.out.println(dex.pokemonInfo(charm));
		System.out.println(dex.pokemonInfo(squirt));
	}
}
