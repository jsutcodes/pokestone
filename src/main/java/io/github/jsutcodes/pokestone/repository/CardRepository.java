package io.github.jsutcodes.pokestone.repository;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.dto.CardDTO;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardEntity;
import io.github.jsutcodes.pokestone.model.CardId;

import java.util.LinkedList;
import java.util.List;

public class CardRepository {
    List<CardEntity> cards;

    public CardRepository() {
        cards = new LinkedList<>();
        CardEntity card = CardEntity.builder()
                .cardClass(String.valueOf(CardClass.CREATURE))
                .attack(1)
                .cost(1)
                .health(1)
                .flavor("Test Pokemon Card.")
                .id(String.valueOf(CardId.builder().cardClass(CardClass.CREATURE).id(1).version(0).build()))
                .name("TestName").build();

        cards.add(card);
    }

    public List<Card> getCardByName(String name) {
        return null;
    }

    public List<Card> getCardByCardType(CardType type) {
        return null;
    }

    public List<Card> getCardById(CardId cardId) {
        return null;
    }

    public List<Card> getCardByString(String searchString) {
        return null;
    }

    public List<CardEntity> getAll() {
        return cards;
    }

    public void saveCard(Card card) {
        cards.add(card);
    }
}
