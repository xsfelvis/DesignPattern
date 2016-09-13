package xsf.design.Strategy;

import android.util.Log;

import xsf.design.util.Constant;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void useStrategy() {
        Log.i(Constant.STRATEGY, "Use Sun: look for sun help!");
    }
}
