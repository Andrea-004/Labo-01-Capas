package com.example.andrea_orellana_lab1.common;

import com.example.andrea_orellana_lab1.domain.entities.Pokemon;
import com.example.andrea_orellana_lab1.domain.entities.PokemonRegions;
import com.example.andrea_orellana_lab1.domain.entities.PokemonType;
import com.example.andrea_orellana_lab1.domain.entities.PokemonZone;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {
    private final List<Pokemon> pokemons;

    public PokemonList(){
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemon.builder()
                .name("Charizard")
                .pokemonType(PokemonType.FIRE)
                .pokemonDebilities(List.of(PokemonType.WATER, PokemonType.PLANT))
                .zone(PokemonZone.CAVERN)
                .region(PokemonRegions.KANTO)
                .build());

        this.pokemons.add(Pokemon.builder()
                .name("Drippy")
                .pokemonType(PokemonType.GHOST)
                .pokemonDebilities(List.of(PokemonType.GHOST, PokemonType.FAIRY))
                .zone(PokemonZone.CAVERN)
                .region(PokemonRegions.KANTO)
                .build());

        this.pokemons.add(Pokemon.builder()
                .name("Mimikyu")
                .pokemonType(PokemonType.GHOST)
                .pokemonDebilities(List.of(PokemonType.GHOST, PokemonType.FAIRY))
                .zone(PokemonZone.LAKE)
                .region(PokemonRegions.HOENN)
                .build());

        this.pokemons.add(Pokemon.builder()
                .name("Squirtle")
                .pokemonType(PokemonType.WATER)
                .pokemonDebilities(List.of(PokemonType.FIRE, PokemonType.PLANT))
                .zone(PokemonZone.SEA)
                .region(PokemonRegions.KANTO)
                .build());

        this.pokemons.add(Pokemon.builder()
                .name("Darkrai")
                .pokemonType(PokemonType.DARK)
                .pokemonDebilities(List.of(PokemonType.FIRE, PokemonType.FAIRY))
                .zone(PokemonZone.CAVERN)
                .region(PokemonRegions.KANTO)
                .build());
    }

    public List<Pokemon>getPokemons() {
        return pokemons;
    }


}
