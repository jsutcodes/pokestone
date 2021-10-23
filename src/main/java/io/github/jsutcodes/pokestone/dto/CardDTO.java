package io.github.jsutcodes.pokestone.dto;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.constants.Rarity;
import io.github.jsutcodes.pokestone.mechanics.Mechanics;
import io.github.jsutcodes.pokestone.model.CardId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDTO {

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
