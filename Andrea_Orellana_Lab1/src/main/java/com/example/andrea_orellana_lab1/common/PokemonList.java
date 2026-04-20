package com.example.andrea_orellana_lab1.common;

import com.example.andrea_orellana_lab1.domain.entities.Pokemon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {
    private final List<Pokemon> pokemons;

    public PokemonList(){
        this.pokemons = new ArrayList<>();
    }


}
