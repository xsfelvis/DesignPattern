package xsf.design.Proxy;

import android.os.SystemClock;
import android.util.Log;

import java.text.SimpleDateFormat;

import xsf.design.Util.Constant;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/12.
 */
public class House implements IHouse {

    public String  name,price;

    public House(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getHouseInfo() {
        Log.i(Constant.PROXY, "House Info- name:" + name + "  price:" + price);
    }

    @Override
    public void signContract() {
        Log.i(Constant.PROXY, "Contract:" + name + "  signed at" +
                new SimpleDateFormat("HH:mm:ss").format(SystemClock.uptimeMillis()));
    }

    @Override
    public void payFees() {
        Log.i(Constant.PROXY, "Bill: name-" + name + "  price" + price);
    }
}
