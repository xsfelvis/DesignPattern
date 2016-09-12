package xsf.design.Proxy;

import android.util.Log;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/12.
 * Copyright 2016 Netease. All rights reserved.
 */
public class ProxyHouse implements IHouse {
    public final String TAG = "proxy";
    private IHouse house;

    public ProxyHouse(IHouse house) {
        this.house = house;
    }

    @Override
    public void getHouseInfo() {
        Log.i(TAG, "searching");
        house.getHouseInfo();
        Log.i(TAG, "search finished");
    }

    @Override
    public void signContract() {
        Log.i(TAG, "prepare contract");
        house.signContract();

    }

    @Override
    public void payFees() {
        house.payFees();
    }
}
