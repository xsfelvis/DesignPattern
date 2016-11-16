package xsf.design.Strategy;

import android.util.Log;

import xsf.design.util.Constant;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public class GreenLight implements IStrategy {


    @Override
    public void useStrategy() {
        Log.i(Constant.STRATEGY, "Use GreenLignt: look for guotai help!");

    }
}
