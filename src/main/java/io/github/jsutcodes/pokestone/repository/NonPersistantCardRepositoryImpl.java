package io.github.jsutcodes.pokestone.repository;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.constants.Rarity;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardId;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NonPersistantCardRepositoryImpl implements CardRepository {
    List<Card> cards;

    public NonPersistantCardRepositoryImpl() {
        cards = new LinkedList<>();
        Card card = Card.builder()
                .cardClass(CardClass.CREATURE)
                .attack(1)
                .cost(1)
                .health(1)
                .flavor("It likes to take nap in the sunshine and the seep on its back uses the rays to grow.")
                .id(CardId.builder().cardClass(CardClass.CREATURE).id(1).version(0).build())
                .type(CardType.GRASS)
                .rarity(Rarity.COMMON)
                .set("ORIGINAL")
                .name("Bulbasaur").build();

        Card card1 = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Leach Seed - At the start of your next turn heal 2 HP to any target.")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(1).version(0).build())
                .type(CardType.GRASS)
                .rarity(Rarity.COMMON)
                .set("ORIGINAL")
                .name("Bulbasaur").build();


        Card card2 = Card.builder()
                .cardClass(CardClass.ITEM)
                .text("Your starter now does +2 on its current effect")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.ITEM).id(2).version(0).build())
                .type(CardType.GRASS)
                .rarity(Rarity.COMMON)
                .set("ORIGINAL")
                .name("LeafStone").build();

        Card card3 = Card.builder()
                .cardClass(CardClass.ITEM)
                .text("Draw 1 Card.")
                .cost(1)
                .id(CardId.builder().cardClass(CardClass.ITEM).id(1).version(0).build())
                .type(CardType.NORMAL)
                .rarity(Rarity.COMMON)
                .set("ORIGINAL")
                .name("Pokeball").build();

        cards.add(card);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

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
