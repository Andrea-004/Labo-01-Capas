package com.example.andrea_orellana_lab1.Runners;

import com.example.andrea_orellana_lab1.services.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PokemonRun implements CommandLineRunner {

    private final PokemonService pokemonService;

    public PokemonRun(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Override
    public void run(String... args) {
        System.out.println("Filtering by type: GHOST");
        pokemonService.getPokemonByType().forEach(p ->
                System.out.println("[PKMN]   Name: " + p.getName() + " | Type: " + p.getPokemonType() + " | Debilities: " + p.getPokemonDebilities())
        );

        System.out.println("Filtering by zone: CAVERN");
        pokemonService.getPokemonByZone().forEach( p ->
                System.out.println("[PKMN] Name: " + p.getName() + " | Type: " + p.getPokemonType() + " | Debilities: " + p.getPokemonDebilities())
        );

        System.out.println("Filtering by debility: FAIRY");
        pokemonService.getPokemonByDebility().forEach(p ->
                System.out.println("[PKMN] Name: " + p.getName() + " | Type: " + p.getPokemonType() + " | Debilities " + p.getPokemonDebilities())
        );
    }
}
