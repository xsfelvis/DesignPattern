package xsf.design.strategy;

import android.util.Log;

import xsf.design.util.Constant;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public class BackDoor implements IStrategy {
    @Override
    public void useStrategy() {
        Log.i(Constant.STRATEGY, "Use Backdoor: look for qiao help!");
    }
}
