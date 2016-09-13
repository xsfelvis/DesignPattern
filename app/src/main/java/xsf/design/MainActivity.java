package xsf.design;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import xsf.design.Proxy.House;
import xsf.design.Proxy.IHouse;
import xsf.design.Proxy.ProxyHandler;
import xsf.design.Proxy.ProxyHouse;
import xsf.design.Strategy.BackDoor;
import xsf.design.Strategy.BlockEnemy;
import xsf.design.Strategy.GreenLight;
import xsf.design.Strategy.StrategyManager;
import xsf.design.base.BaseActvity;
import xsf.design.util.Constant;

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
        StrategyManager strategyManager = null;
        Log.i(Constant.STRATEGY, "occur problem 1");
        strategyManager = new StrategyManager(new BackDoor());
        strategyManager.operation();
        Log.i(Constant.STRATEGY, "occur problem 2");
        strategyManager = new StrategyManager(new GreenLight());
        strategyManager.operation();
        Log.i(Constant.STRATEGY, "occur problem 3");
        strategyManager = new StrategyManager(new BlockEnemy());
        strategyManager.operation();
    }

    /**
     * 动态代理模式
     */
    private void dynicProxy() {

        ProxyHandler proxyHandler = new ProxyHandler();
        IHouse house = (IHouse) proxyHandler.newProxyInstance(new House("xsf house", "1700"));
        Log.i(Constant.PROXY, "looking for a perfect house");
        house.getHouseInfo();
        Log.i(Constant.PROXY, "thinking");
        house.signContract();
        house.payFees();
        Log.i(Constant.PROXY, "done");
    }

    /**
     * 普通策略模式
     */
    private void ProxyTest() {
        IHouse house = new House("xsf house", "1700");
        IHouse proxyHouse = new ProxyHouse(house);
        Log.i(Constant.PROXY, "looking for a perfect house");
        proxyHouse.getHouseInfo();
        Log.i(Constant.PROXY, "thinking");
        proxyHouse.signContract();
        proxyHouse.payFees();
        Log.i(Constant.PROXY, "done");
    }
}
