package xsf.design.strategy;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public class StrategyManager {
    private IStrategy strategy;

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
