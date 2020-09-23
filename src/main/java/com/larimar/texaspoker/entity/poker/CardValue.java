package com.larimar.texaspoker.entity.poker;

/**
 * 牌面枚举
 *
 * @author tyl
 * @time 2020/9/11 周五 17:55
 */
public enum CardValue {
    one("1", 1),
    two("2", 2),
    three("3", 3),
    four("4", 4),
    five("5", 5),
    six("6", 6),
    seven("7", 7),
    eight("8", 8),
    nine("9", 9),
    ten("10", 10),
    jack("J", 11),
    queen("Q", 12),
    king("K", 13),
    ;

    public String getValue() {
        return value;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    private final String value;
    private final Integer sortNum;

    CardValue(String value, Integer sortNum) {
        this.value = value;
        this.sortNum = sortNum;
    }
}
