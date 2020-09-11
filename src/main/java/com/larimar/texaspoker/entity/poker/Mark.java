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
    spade("♠"),
    /**
     * 红心
     */
    heart("♥"),
    /**
     * 方块
     */
    diamond("♦"),
    /**
     * 梅花
     */
    club("♣"),
    ;

    Mark(String sign) {
        this.sign = sign;
    }

    /**
     * 牌色符号
     */
    private final String sign;

    public String getName() {
        return sign;
    }
}
