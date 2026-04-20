package com.example.andrea_orellana_lab1.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    private String name;
    private PokemonType pokemonType;
    private List<PokemonType> pokemonDebilities;
    private String zone;
    private String region;
}
