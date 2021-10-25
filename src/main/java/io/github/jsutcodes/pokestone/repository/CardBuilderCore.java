package io.github.jsutcodes.pokestone.repository;

import io.github.jsutcodes.pokestone.constants.CardClass;
import io.github.jsutcodes.pokestone.constants.CardType;
import io.github.jsutcodes.pokestone.constants.Rarity;
import io.github.jsutcodes.pokestone.model.Card;
import io.github.jsutcodes.pokestone.model.CardId;

import java.util.LinkedList;
import java.util.List;

public final class CardBuilderCore implements  CardBuilder {

    private   List<Card> cards;

    @Override
    public List<Card> loadCards() {

       cards = new LinkedList<>();

        cards.addAll(starterCards());
//
//    Card card = Card.builder()
//                .cardClass(CardClass.CREATURE)
//                .attack(1)
//                .cost(1)
//                .health(1)
//                .flavor("It likes to take nap in the sunshine and the seep on its back uses the rays to grow.")
//                .id(CardId.builder().cardClass(CardClass.CREATURE).id(1).version(0).build())
//                .type(CardType.GRASS)
//                .rarity(Rarity.COMMON)
//                .set("ORIGINAL")
//                .name("Bulbasaur").build();
//
//        Card card1 = Card.builder()
//                .cardClass(CardClass.STARTER)
//                .text("Leach Seed - At the start of your next turn heal 2 HP to any target.")
//                .cost(2)
//                .id(CardId.builder().cardClass(CardClass.STARTER).id(1).version(0).build())
//                .type(CardType.GRASS)
//                .rarity(Rarity.COMMON)
//                .set("ORIGINAL")
//                .name("Bulbasaur").build();
//
//
//        Card card2 = Card.builder()
//                .cardClass(CardClass.ITEM)
//                .text("Your starter now does +2 on its current effect")
//                .cost(2)
//                .id(CardId.builder().cardClass(CardClass.ITEM).id(2).version(0).build())
//                .type(CardType.GRASS)
//                .rarity(Rarity.COMMON)
//                .set("ORIGINAL")
//                .name("LeafStone").build();
//
//        Card card3 = Card.builder()
//                .cardClass(CardClass.ITEM)
//                .text("Draw 1 Card.")
//                .cost(1)
//                .id(CardId.builder().cardClass(CardClass.ITEM).id(1).version(0).build())
//                .type(CardType.NORMAL)
//                .rarity(Rarity.COMMON)
//                .set("ORIGINAL")
//                .name("Pokeball").build();
//
//        cards.add(card);
//        cards.add(card1);
//        cards.add(card2);
//        cards.add(card3);

        return cards;
    }

    private static List<Card> starterCards() {

        List<Card> starterCards = new LinkedList<>();

        Card bulbasaur = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Leach Seed - At the start of your next turn heal 2 HP to any ally pokemon.")
                .flavor("Bulbasaur Like most grass type is healing focused. and waiting out the battle for bigger, and better things.")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(1).version(0).build())
                .type(CardType.GRASS)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("Bulbasaur").build();

        Card charmander = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Fire Spin - Give target ally pokemon  +2/-1., until next turn. (-1 damage stays.)")
                .flavor("True to its firey personality, Charmander is willing to do better damage early in risk of lower def.")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(4).version(0).build())
                .type(CardType.FIRE)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("Charmander").build();

        Card squirtle = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Bubble - Give target rival pokemon -1/0. until next turn.")
                .flavor("Squirtle is about slowing down the enemy, and giving debuffs.")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(7).version(0).build())
                .type(CardType.WATER)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("squirtle").build();

        Card caterpie = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Harden - Summon a 0/3 Metapod .")
                .flavor("A rather scared Bug Type, it prefers to hide behind other bugs.")
                .cost(1)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(10).version(0).build())
                .type(CardType.BUG)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("caterpie").build();

        Card weedle = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Harden - summon a 1/2 Kakuna.")
                .flavor("A Bug that is not quite as scared as it prefers to fight when provoked.")
                .cost(1)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(13).version(0).build())
                .type(CardType.BUG)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("weedle").build();

        Card pidgey = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Gust - 50% chance for rival to attack wrong pokemon.")
                .flavor("???")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(16).version(0).build())
                .type(CardType.FLYING)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("pidgey").build();

        Card nidoran_female = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Poison Sting - Deal 1 poison counter on target pokemon")
                .flavor("The barbs on its fur are poisonous.")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(29).version(0).build())
                .type(CardType.POISON)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("nidoran(f)").build();

        Card nidoran_male = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Poison Sting - Deal 1 poison counter on target pokemon")
                .flavor("Excelent hearing. blah blah blah.")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(32).version(0).build())
                .type(CardType.POISON)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("nidoran(m)").build();


        Card oddish = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Moonlight - gain a moonlight charge, after 1,2  charges gain an empty energy. (Increases after getting the mana bonus after max energy No longer does anything)")
                .flavor("Oddish doesn't really like to fight, It always just seems to stare at the sun and moon.")
                .cost(1)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(43).version(0).build())
                .type(CardType.GRASS)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("Oddish").build();

        Card poliwag = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Hypnosis - Target rival pokemon is unable to attack next turn.")
                .flavor("Poliwag, tadpole pokemon. uses its spiral shaped belly to lure pokemon to sleep. ")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(60).version(0).build())
                .type(CardType.WATER)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("poliwag").build();

        Card abra = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Teleport - Return an ally pokemon to your hand.")
                .flavor("Even while abra is sleeping it can escape a foe by teleporting away.")
                .cost(3)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(63).version(0).build())
                .type(CardType.PSYCHIC)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("abra").build();

        Card machop = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Focus Energy - next turn temporarily give a pokemon +2/+0.")
                .flavor("No matter how much it excersizes it never gets sore. ")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(66).version(0).build())
                .type(CardType.FIGHTING)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("machop").build();

        Card bellsprout = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Sweet scent - summon a 0/1 bug pokemon (caterpie or weedle.)")
                .flavor("I want bellsprout to use as a token sacrafice starter. ")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(69).version(0).build())
                .type(CardType.GRASS)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("bellsprout").build();

        Card geodude = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Defense Curl - Gain +2 armor.")
                .flavor(" ")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(74).version(0).build())
                .type(CardType.ROCK)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("geodude").build();

        Card ghastly = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Lick - Deal 1 damage to target rival pokemon, it now has paralysis. (too scared to attack next turn). ")
                .flavor(" I would be scared if ghastly licked me too!")
                .cost(2)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(92).version(0).build())
                .type(CardType.GHOST)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("ghastly").build();

        Card dratini = Card.builder()
                .cardClass(CardClass.STARTER)
                .text("Hyper Beam - Deals 10 damage. After using must rest for 1 turn.")
                .flavor("As it grows its constantly in molt, shedding its skin, to accomodate the life energy that build up within it.")
                .cost(10)
                .id(CardId.builder().cardClass(CardClass.STARTER).id(147).version(0).build())
                .type(CardType.DRAGON)
                .rarity(Rarity.COMMON)
                .set("CORE")
                .name("dratini").build();

        // Starter's List
        starterCards.add(bulbasaur); // Long game focused, surviing the battle
        starterCards.add(charmander); // Hasty, gives pokemon more attack at cost of losing health
        starterCards.add(squirtle); // defates rivals stats
        starterCards.add(caterpie); // Def focused bug
        starterCards.add(weedle); // attack focused bug
        starterCards.add(pidgey);
        starterCards.add(nidoran_female);
        starterCards.add(nidoran_male);
        starterCards.add(oddish);
        starterCards.add(poliwag);
        starterCards.add(abra);
        starterCards.add(machop);
        starterCards.add(bellsprout);
        starterCards.add(geodude);
        starterCards.add(ghastly);
        starterCards.add(dratini);

       // future expansions:
       // - eeveelutions (eevee as a starter)
       // - pokemon with only 2 evelutions as starters
       // - Fossils (fossl (helix, old amber, etc.) - evelotuin 1, eveloution 2)
       // - everstoneNotNeeded (lickitung, pinsor, syther etc)
       // -  Legendaries (???)


        return starterCards;
    }


}
