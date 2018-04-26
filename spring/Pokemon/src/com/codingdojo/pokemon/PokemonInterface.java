package com.codingdojo.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, int health, String type);
	void attackPokemon(Pokemon poke);
	String pokemonInfo(Pokemon poke);
}
