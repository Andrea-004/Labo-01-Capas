package com.example.andrea_orellana_lab1.services;

import com.example.andrea_orellana_lab1.domain.entities.Pokemon;
import com.example.andrea_orellana_lab1.domain.entities.PokemonRegions;
import com.example.andrea_orellana_lab1.domain.entities.PokemonType;
import com.example.andrea_orellana_lab1.domain.entities.PokemonZone;
import com.example.andrea_orellana_lab1.repositories.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {
    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getPokemonByType() {
        return pokemonRepository.findAll().stream().filter(pokemon -> pokemon.getPokemonType() == PokemonType.GHOST).collect(Collectors.toList());
    }

    public List<Pokemon> getPokemonByZone() {
        return pokemonRepository.findAll().stream().filter(pokemon -> pokemon.getZone() == PokemonZone.CAVERN).collect(Collectors.toList());
    }

    public List<Pokemon> getPokemonByDebility() {
        return pokemonRepository.findAll().stream().filter(pokemon -> pokemon.getPokemonDebilities().contains(PokemonType.FAIRY)).collect(Collectors.toList());
    }

}
