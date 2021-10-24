package io.github.jsutcodes.pokestone.model.dao;

import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardId;

import java.util.List;

public interface CardDAO {

    public List<Card> getCardByName(String name);

    List<Card> getCardByCardType(CardType type);

    List<Card> getCardById(CardId cardId);

    List<Card> getCardByString(String searchString);

    List<Card> getAll();

    void saveCard(Card card);
}
