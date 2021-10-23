package io.github.jsutcodes.pokestone.validator;

import io.github.jsutcodes.pokestone.dto.CardDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CardValidator {
    public static boolean isValid(CardDTO cardDTO) {

        final String cardId = cardDTO.getId().toString();

        log.info("validating Incoming Card Request: {}", cardId);

        return true;
    }
}
