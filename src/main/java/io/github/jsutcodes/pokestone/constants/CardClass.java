package io.github.jsutcodes.pokestone.constants;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum CardClass {
    STARTER(0), CREATURE(1), ITEM(2);

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
