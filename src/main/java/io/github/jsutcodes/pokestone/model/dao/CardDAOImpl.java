package io.github.jsutcodes.pokestone.model.dao;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardEntity;
import io.github.jsutcodes.pokestone.model.CardId;
import io.github.jsutcodes.pokestone.repository.CardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class CardDAOImpl implements CardDAO {

    @Autowired private CardRepository cardRepository;
//    @Autowired private ModelMapper cardToEntityMapper;
//    @Autowired private ModelMapper cardToDTOMapper;

    @Override
    public List<Card> getCardByName(String name) {
        return cardRepository.getCardByName(name);

    }

    @Override
    public List<Card> getCardByCardType(CardType type){
        return cardRepository.getCardByCardType(type);
    }

    @Override
    public List<Card> getCardById(CardId cardId) {
        return cardRepository.getCardById(cardId);
    }

    @Override
    public List<Card> getCardByString(String searchString) {
        return cardRepository.getCardByString(searchString);
    }

   @Override
   public  List<Card> getAll() {
        return  cardRepository.getAll();
    }

    @Override
    public void saveCard(Card card) {
       cardRepository.saveCard(card);
       log.info("Saved Card {} into the database. ",card.getId() );

    }

    @Override
    public List<Card> getCardByCardClass(CardClass cardClass) {
       return  cardRepository.getCardByCardClass(cardClass);
    }

}
