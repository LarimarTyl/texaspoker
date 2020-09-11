package com.larimar.texaspoker.entity.poker;

/**
 * 牌面枚举
 *
 * @author tyl
 * @time 2020/9/11 周五 17:55
 */
public enum CardValue {
    one("1"),
    two("2"),
    three("3"),
    four("4"),
    five("5"),
    six("6"),
    seven("7"),
    eight("8"),
    nine("9"),
    ten("10"),
    jack("J"),
    queen("Q"),
    king("K"),
    ;

    public String getValue() {
        return value;
    }

    private final String value;

    CardValue(String value) {
        this.value = value;
    }
}
