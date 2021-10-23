package io.github.jsutcodes.pokestone.constants;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum CardClass {
    CREATURE(0), SPELL(1), ITEM(3);

    private int id;

    private CardClass(int id) {
        this.id = id;
    }

    @JsonCreator
    public static CardClass forValue(String name) {
        CardClass ccValue = null;

        for(CardClass c: values()) {
            if(c.toString().equals((name))){
                ccValue =  c;
            }
        }
        return ccValue;
    }
}
