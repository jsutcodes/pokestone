package io.github.jsutcodes.pokestone.controller;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardId;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.validator.CardCreationValidator;
import io.github.jsutcodes.pokestone.constants.APIConstants;
import io.github.jsutcodes.pokestone.dto.CardDTO;
import io.github.jsutcodes.pokestone.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(APIConstants.CARDS_REQUESTS)
public class CardAPIController {

    @Autowired private CardService cards;
   // private ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/v1.0")
    public List<Card> getCards() {
        return cards.getAll();
    }

    @GetMapping("/v1.0/{id}")
    public List<Card> getCardById(@PathVariable("id") CardId cardId) {
        return cards.getCardById(cardId);
    }

    @GetMapping("/v1.0/type/{type}")
    public List<Card> getCardByType(@PathVariable("type") CardType type) {
        return cards.getCardByCardType(type);
    }

    @GetMapping("/v1.0/name/{name}")
    public List<Card> getCardByName(@PathVariable("name") String name) {
        return cards.getCardByName(name);
    }

    @GetMapping("/v1.0/class/{cardClass}")
    public List<Card> getCardByName(@PathVariable("cardClass") CardClass cardClass) {
        return cards.getCardByCardClass(cardClass);
    }

    @GetMapping("search/v1.0")
    public List<Card> getCardByString(@RequestParam("searchString") String searchString) {
        return cards.getCardByString(searchString);
    }

    @PostMapping(value = "/v1.0", consumes = APIConstants.JSON, produces = APIConstants.JSON)
    public ResponseEntity<CardDTO> createCard(@RequestBody CardDTO cardDTO) {
        HttpStatus statusResponse = HttpStatus.BAD_REQUEST;

        if (CardCreationValidator.isValid(cardDTO)) {
            statusResponse = HttpStatus.ACCEPTED;
        }
        return new ResponseEntity<>(statusResponse);
    }
}
