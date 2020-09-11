package com.larimar.texaspoker.entity.poker;

/**
 * @author tyl
 * @time 2020/9/11 周五 18:16
 */
public enum Joker {
    Red_Joker("JOKER"),
    Black_Joker("joker");

    public String getValue() {
        return value;
    }

    private final String value;

    Joker(String value) {
        this.value = value;
    }
}
