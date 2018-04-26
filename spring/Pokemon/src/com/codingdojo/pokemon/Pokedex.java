package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon implements PokemonInterface {
	public String pokemonInfo(Pokemon poke) {
		return ("Name: " + poke.getName() + " / Heath: " + poke.getHealth() + " / Type: " + poke.getType());
	}
}
