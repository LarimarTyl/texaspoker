package com.larimar.texaspoker.entity.poker;

/**
 * 牌色枚举
 *
 * @author tyl
 * @time 2020/9/11 周五 17:47
 */
public enum Mark {
    /**
     * 黑桃
     */
    spade("♠", 4),
    /**
     * 红心
     */
    heart("♥", 3),
    /**
     * 方块
     */
    diamond("♦", 2),
    /**
     * 梅花
     */
    club("♣", 1),
    ;

    /**
     * 牌色符号
     */
    private final String sign;
    private final Integer sortNum;

    public String getSign() {
        return sign;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    Mark(String sign, Integer sortNum) {
        this.sign = sign;
        this.sortNum = sortNum;
    }
}
