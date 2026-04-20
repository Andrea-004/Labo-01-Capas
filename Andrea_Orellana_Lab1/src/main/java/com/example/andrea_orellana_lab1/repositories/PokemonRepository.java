package com.example.andrea_orellana_lab1.repositories;

import com.example.andrea_orellana_lab1.common.PokemonList;
import com.example.andrea_orellana_lab1.domain.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {
    private final PokemonList pokemonList;

    public List<Pokemon> findByType() {
        return pokemonList.getPokemons();
    }
}
