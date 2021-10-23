package io.github.jsutcodes.pokestone.constants;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Rarity {
    COMMON(0), LEGENDARY(1);

    private int id;

    private Rarity(int id) {
        this.id = id;
    }

    @JsonCreator
    public static Rarity forValue(String name) {
        Rarity ccValue = null;

        for(Rarity c: values()) {
            if(c.toString().equals((name))){
                ccValue =  c;
            }
        }
        return ccValue;
    }
}
