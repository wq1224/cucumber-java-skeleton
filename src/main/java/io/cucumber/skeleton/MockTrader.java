package io.cucumber.skeleton;

public class MockTrader {
    public static String TRADE_CLICK="CLICK";
    //（2）采用点击成交方式的，申报数量应当为10万元面额或者其整数倍；
    public static boolean doTrade (String TradeType, int amount) {
        if (TRADE_CLICK.equals(TradeType)) {
            if (amount% 100000 == 0) {
                return true;
            }
        }
        return false;
    }
}
