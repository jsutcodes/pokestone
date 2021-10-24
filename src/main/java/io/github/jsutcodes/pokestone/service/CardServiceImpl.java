package io.github.jsutcodes.pokestone.service;

import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardId;
import io.github.jsutcodes.pokestone.model.dao.CardDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CardServiceImpl implements CardService {

    @Autowired private CardDAO cardDAOController;

    public List<Card> getCardByName(String name) {
        return cardDAOController.getCardByName(name);
    }

    public List<Card> getCardByCardType(CardType type) {
        return cardDAOController.getCardByCardType(type);
    }

    public List<Card> getCardById(CardId cardId) {
        return cardDAOController.getCardById(cardId);
    }

    public List<Card> getCardByString(String searchString) {
        return cardDAOController.getCardByString(searchString);
    }

    public List<Card> getAll() {
        return cardDAOController.getAll();
    }
}
