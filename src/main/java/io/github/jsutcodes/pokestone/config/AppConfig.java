package io.github.jsutcodes.pokestone.config;

import io.github.jsutcodes.pokestone.repository.CardRepository;
import io.github.jsutcodes.pokestone.repository.NonPersistantCardRepositoryImpl;
import io.github.jsutcodes.pokestone.service.CardService;
import io.github.jsutcodes.pokestone.service.CardServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    CardService cardService() {
        return new CardServiceImpl();
    }

    @Bean
    CardRepository cardRepository() {
        return new NonPersistantCardRepositoryImpl();
    }

// Create this once a real database is in place
//    @Bean
//    NonPersistantCardRepository cardRepository() {
//        return new CardRepositoryImpl();
//    }
}
