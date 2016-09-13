package xsf.design;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import xsf.design.Proxy.House;
import xsf.design.Proxy.IHouse;
import xsf.design.Proxy.ProxyHandler;
import xsf.design.Proxy.ProxyHouse;
import xsf.design.Strategy.StrategyManager;
import xsf.design.base.BaseActvity;

public class MainActivity extends BaseActvity {
    private Button btn_proxy;
    private Button btn_dynproxy;
    private Button btn_strtegy;


    @Override
    protected int setLayoutResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        btn_proxy = IfindViewById(R.id.btn_proxy);
        btn_proxy.setOnClickListener(this);
        btn_dynproxy = IfindViewById(R.id.btn_dynicprocy);
        btn_dynproxy.setOnClickListener(this);
        btn_strtegy = IfindViewById(R.id.btn_strategy);
        btn_strtegy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_proxy:
                ProxyTest();
                break;
            case R.id.btn_dynicprocy:
                dynicProxy();
                break;
            case R.id.btn_strategy:
                strategy();
                break;
        }
    }

    /**
     * 策略模式
     */
    private void strategy() {

        StrategyManager strategyManager  = null;


    }

    /**
     * 动态代理模式
     */
    private void dynicProxy() {
        final String TAG = "proxy";
        ProxyHandler proxyHandler = new ProxyHandler();
        IHouse house = (IHouse) proxyHandler.newProxyInstance(new House("xsf house", "1700"));
        Log.i(TAG, "looking for a perfect house");
        house.getHouseInfo();
        Log.i(TAG, "thinking");
        house.signContract();
        house.payFees();
        Log.i(TAG, "done");
    }

    /**
     * 普通策略模式
     */
    private void ProxyTest() {
        final String TAG = "proxy";
        IHouse house = new House("xsf house", "1700");
        IHouse proxyHouse = new ProxyHouse(house);
        Log.i(TAG, "looking for a perfect house");
        proxyHouse.getHouseInfo();
        Log.i(TAG, "thinking");
        proxyHouse.signContract();
        proxyHouse.payFees();
        Log.i(TAG, "done");
    }
}
