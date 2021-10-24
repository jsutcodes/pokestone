package io.github.jsutcodes.pokestone.model;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.constants.Rarity;
import io.github.jsutcodes.pokestone.mechanics.Mechanics;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
//@Entity
//@Table(name = "cards")
public class CardEntity {
    String id;
    String name;
    String text;
    String flavor;
    int cost;
    int attack;
    int health;
    String cardClass;
    String mechanics;
    int rarity;
    String set;
    int type;

}
