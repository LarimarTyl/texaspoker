package com.larimar.texaspoker.service.pocker;

import com.larimar.texaspoker.entity.poker.*;

import java.util.*;

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
                return getPoker(1);
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
        List<Poker> pokers = new LinkedList<>();
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

    /**
     * 洗牌(随机排序)
     *
     * @param pokers 初始牌组
     * @return
     */
    public static void shuffle(List<Poker> pokers) {
        Random random = new Random();
        for (int i = 0; i < pokers.size(); i++) {
            int index = random.nextInt(pokers.size());
            Poker indexPoker = pokers.get(index);
            Poker replacePoker = pokers.get(i);
            pokers.set(index, replacePoker);
            pokers.set(i, indexPoker);
        }
    }

    /**
     * 发牌逻辑
     *
     * @param pokers   总牌堆
     * @param player   玩家数量
     * @param pokerNum 手牌数量
     * @return 各玩家手牌及底牌
     */
    public static Map<String, List<Poker>> dealPoker(List<Poker> pokers, int player, int pokerNum) {
        HashMap<String, List<Poker>> result = new HashMap<>();
        for (int i = 0; i < player; i++) {
            LinkedList<Poker> handPoker = new LinkedList<>();
            for (int j = 0; j < pokerNum; j++) {
                handPoker.add(pokers.get(0));
                pokers.remove(0);
            }
            handPoker.sort(new Poker.PokerComparator());
            result.put("第" + (i + 1) + "位玩家手牌", handPoker);
        }
        result.put("底牌", pokers);
        return result;
    }

    public static void main(String[] args) {
        List<Poker> pokers = initPoker(Type.Landlord);
        shuffle(pokers);
        Map<String, List<Poker>> pokerMap = dealPoker(pokers, 3, 17);
        for (Map.Entry<String, List<Poker>> entry : pokerMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            List<Poker> pokerList = entry.getValue();
            for (Poker poker : pokerList) {
                if (poker.getJoker() != null) {
                    System.out.print(poker.getJoker().getValue() + " ,");
                } else {
                    System.out.print(poker.getMark().getSign() + " " + poker.getCardValue().getValue() + " ,");
                }
            }
            System.out.println();
        }
    }
}
