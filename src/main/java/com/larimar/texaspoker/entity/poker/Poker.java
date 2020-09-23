package com.larimar.texaspoker.entity.poker;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

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

    public static class PokerComparator implements Comparator<Poker> {

        @Override
        public int compare(Poker p1, Poker p2) {
            if (p1 == null || p2 == null) {
                return 0;
            }
            Integer sort1;
            Integer sort2;
            if (p1.getJoker() == null) {
                sort1 = p1.getCardValue().getSortNum();
            } else {
                sort1 = p1.getJoker().getSortNum();
            }

            if (p2.getJoker() == null) {
                sort2 = p2.getCardValue().getSortNum();
            } else {
                sort2 = p2.getJoker().getSortNum();
            }
            if (!sort1.equals(sort2)) {
                return sort1.compareTo(sort2);
            } else {
                return p1.getMark().getSortNum().compareTo(p2.mark.getSortNum());
            }
        }
    }
}
