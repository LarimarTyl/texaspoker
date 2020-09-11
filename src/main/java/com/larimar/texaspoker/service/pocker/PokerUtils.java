package com.larimar.texaspoker.service.pocker;

import com.larimar.texaspoker.entity.poker.*;

import java.util.ArrayList;
import java.util.List;

import static com.larimar.texaspoker.entity.poker.Joker.Black_Joker;
import static com.larimar.texaspoker.entity.poker.Joker.Red_Joker;

/**
 * 扑克牌工具类
 *
 * @author tyl
 * @time 2020/9/11 周五 18:23
 */
public class PokerUtils {
    /**
     * 初始化牌组方法
     *
     * @param type 扑克游戏类型
     * @return 初始化牌组
     */
    public static List<Poker> initPoker(Type type) {
        switch (type) {
            case Texas:
                return getPoker(1);
            case Landlord:
                return getPoker(2);
            case Square:
                return getPoker(3);
            default:
                return getPoker(1);
        }
    }

    /**
     * 需要几副牌
     *
     * @param cases 牌盒数量
     * @return 牌数组
     */
    private static List<Poker> getPoker(int cases) {
        List<Poker> pokers = new ArrayList<>();
        for (int i = 0; i < cases; i++) {
            for (Mark mark : Mark.values()) {
                for (CardValue cardValue : CardValue.values()) {
                    Poker poker = new Poker(cardValue, mark);
                    pokers.add(poker);
                }
            }
            Poker redJoker = new Poker(Joker.valueOf(Red_Joker.name()));
            Poker blackJoker = new Poker(Joker.valueOf(Black_Joker.name()));
            pokers.add(redJoker);
            pokers.add(blackJoker);
        }
        return pokers;
    }
}
