package io.github.jsutcodes.pokestone.repository;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardId;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NonPersistantCardRepositoryImpl implements CardRepository {
    List<Card> cards;

    public NonPersistantCardRepositoryImpl() {
        cards = new LinkedList<>();
        loadAllCards();

    }

    private void loadAllCards() {
        //Load Core Cards (base)
        cards.addAll(new CardBuilderCore().loadCards());
    }

    public List<Card> getCardByName(String name) {
        return cards.stream().filter( c -> c.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Card> getCardByCardType(CardType type) {
        return cards.stream().filter( c -> c.getType().equals(type)).collect(Collectors.toList());
    }

    public List<Card> getCardById(CardId cardId) {
        return null;
    }

    public List<Card> getCardByString(String searchString) {
        return null;
    }

    public List<Card> getAll() {
        return cards;
    }

    public void saveCard(Card card) {
       // cards.add(card);
    }

    @Override
    public  List<Card> getCardByCardClass(CardClass cardClass) {
       return  cards.stream().filter( c-> c.getCardClass().equals(cardClass)).collect(Collectors.toList());
    }
}
