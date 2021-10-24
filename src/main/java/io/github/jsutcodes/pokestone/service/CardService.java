package io.github.jsutcodes.pokestone.service;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardId;
import io.github.jsutcodes.pokestone.constants.CardType;

import java.util.List;

public interface CardService {

    public List<Card> getCardByName(String name);

    public List<Card> getCardByCardType(CardType type);

    public List<Card> getCardById(CardId cardId);

    public List<Card> getCardByString(String searchString);

    public List<Card> getAll();

    List<Card> getCardByCardClass(CardClass cardClass);
}
