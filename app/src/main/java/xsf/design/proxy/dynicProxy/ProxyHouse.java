package xsf.design.proxy.dynicProxy;

import android.util.Log;

import xsf.design.util.Constant;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/12.
 */
public class ProxyHouse implements IHouse {

    private IHouse house;

    public ProxyHouse(IHouse house) {
        //里氏替换,依赖倒转(面向接口)
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
