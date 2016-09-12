package xsf.design;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import xsf.design.Proxy.House;
import xsf.design.Proxy.IHouse;
import xsf.design.Proxy.ProxyHandler;
import xsf.design.Proxy.ProxyHouse;
import xsf.design.base.BaseActvity;

public class MainActivity extends BaseActvity {
    private Button btn_mvc;
    private Button btn_mvp;


    @Override
    protected int setLayoutResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        btn_mvc = IfindViewById(R.id.btn_proxy);
        btn_mvc.setOnClickListener(this);
        btn_mvp = IfindViewById(R.id.btn_dynicprocy);
        btn_mvp.setOnClickListener(this);
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
        }
    }

    /**
     * 动态代理模式
     */
    private void dynicProxy() {
        final String TAG = "proxy";
        ProxyHandler proxyHandler = new ProxyHandler();
        IHouse house = (IHouse) proxyHandler.newProxyInstance(new House("xsf house","1700"));
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
