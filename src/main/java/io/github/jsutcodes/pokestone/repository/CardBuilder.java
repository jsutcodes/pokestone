package io.github.jsutcodes.pokestone.repository;

import io.github.jsutcodes.pokestone.model.Card;

import java.util.List;

public interface CardBuilder {

    List<Card> loadCards();
}
