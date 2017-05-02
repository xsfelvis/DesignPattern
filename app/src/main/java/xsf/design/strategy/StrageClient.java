package xsf.design.Strategy;

/**
 * Author: 彩笔学长
 * Time: created at 19/11/2016.
 * Description:
 */

public class StrageClient {
    public static void main(String[] args) {
        StrategyManager strategyManager = new StrategyManager(new BackDoor());
        strategyManager.operation();
    }
}
