package xsf.design.Proxy;

import android.os.SystemClock;
import android.util.Log;

import java.text.SimpleDateFormat;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/12.
 * Copyright 2016 Netease. All rights reserved.
 */
public class House implements IHouse {
    public final String TAG = "proxy";
    public String  name,price;

    public House(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getHouseInfo() {
        Log.i(TAG, "House Info- name:" + name + "  price:" + price);
    }

    @Override
    public void signContract() {
        Log.i(TAG, "Contract:" + name + "  signed at" +
                new SimpleDateFormat("HH:mm:ss").format(SystemClock.uptimeMillis()));
    }

    @Override
    public void payFees() {
        Log.i(TAG, "Bill: name-" + name + "  price" + price);
    }
}
