package com.example.andrea_orellana_lab1;

import com.example.andrea_orellana_lab1.domain.entities.PokemonType;
import com.example.andrea_orellana_lab1.services.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AndreaOrellanaLab1Application {

    public static void main(String[] args) {
        SpringApplication.run(AndreaOrellanaLab1Application.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonService pokemonService) {

        return args -> {

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
        };
    }

}
