package io.github.jsutcodes.pokestone.model;

import io.github.jsutcodes.pokestone.constants.CardClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//  cards will be uniquely identifiable by card type, card id, card version (for example POKEMON-001-0)
@Data
@Builder
@AllArgsConstructor
public final class CardId {

    private CardClass cardClass;
    private int id;
    private int version;
}
