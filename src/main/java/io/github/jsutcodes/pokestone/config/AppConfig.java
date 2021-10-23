package io.github.jsutcodes.pokestone.config;

import io.github.jsutcodes.pokestone.service.CardService;
import io.github.jsutcodes.pokestone.service.CardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    CardService cardService() {
        return new CardServiceImpl();
    }
}
