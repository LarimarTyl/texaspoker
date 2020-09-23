package com.larimar.texaspoker.entity.poker;

/**
 * @author tyl
 * @time 2020/9/11 周五 18:16
 */
public enum Joker {
    Red_Joker("JOKER",15),
    Black_Joker("joker",14);

    public String getValue() {
        return value;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    private final String value;
    private final Integer sortNum;



    Joker(String value, Integer sortNum) {
        this.value = value;
        this.sortNum = sortNum;
    }
}
