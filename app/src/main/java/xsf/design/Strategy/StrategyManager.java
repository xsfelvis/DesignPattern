package xsf.design.Strategy;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public class StrategyManager {
    private IStrategy strategy;

    public StrategyManager() {
    }

    public StrategyManager(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operation() {
        if (strategy != null) {
            strategy.useStrategy();
        } else {
            new Throwable("strategy cannt be null");
        }

    }

}
