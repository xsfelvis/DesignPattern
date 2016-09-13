package xsf.design.Proxy;

import android.util.Log;

import xsf.design.util.Constant;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/12.
 * Copyright 2016 Netease. All rights reserved.
 */
public class ProxyHouse implements IHouse {

    private IHouse house;

    public ProxyHouse(IHouse house) {
        this.house = house;
    }

    @Override
    public void getHouseInfo() {
        Log.i(Constant.PROXY, "searching");
        house.getHouseInfo();
        Log.i(Constant.PROXY, "search finished");
    }

    @Override
    public void signContract() {
        Log.i(Constant.PROXY, "prepare contract");
        house.signContract();

    }

    @Override
    public void payFees() {
        house.payFees();
    }
}
