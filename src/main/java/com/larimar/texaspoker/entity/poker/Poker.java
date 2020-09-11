package com.larimar.texaspoker.entity.poker;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 扑克实体类
 *
 * @author tyl
 * @time 2020/9/11 周五 18:05
 */

@Data
@NoArgsConstructor
public class Poker {

    /**
     * 牌值
     */
    private CardValue cardValue;
    /**
     * 花色
     */
    private Mark mark;
    /**
     * 牌样式
     */
    private String style;
    /**
     * 王牌值
     */
    private Joker joker;

    public Poker(CardValue cardValue, Mark mark) {
        this.cardValue = cardValue;
        this.mark = mark;
    }

    public Poker(Joker joker) {
        this.joker = joker;
    }
}
