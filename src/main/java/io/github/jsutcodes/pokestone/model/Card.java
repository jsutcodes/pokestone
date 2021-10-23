package io.github.jsutcodes.pokestone.model;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.constants.Rarity;
import io.github.jsutcodes.pokestone.mechanics.Mechanics;

public class Card {
    CardId id;
    String name;
    String text;
    String flavor;
    int cost;
    int attack;
    int health;
    CardClass cardClass;
    Mechanics[] mechanics;
    Rarity rarity;
    String set;
    CardType type;
}
