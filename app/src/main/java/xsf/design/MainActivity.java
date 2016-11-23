package xsf.design;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import state.LoginActvity;
import xsf.design.Factory.ConcreateFactory;
import xsf.design.Factory.Factory;
import xsf.design.Factory.Product;
import xsf.design.Factory.ProductA;
import xsf.design.Principle.DiskCache;
import xsf.design.Principle.DouleCache;
import xsf.design.Principle.IImageCache;
import xsf.design.Principle.ImageLoader;
import xsf.design.Principle.MemoryCache;
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
    private Button btn_principle;
    private Button btn_proxy;
    private Button btn_dynproxy;
    private Button btn_strtegy;
    private Button btn_builder;
    private Button btn_factory;
    private Button btn_state;

    private ImageView imgProfile;


    @Override
    protected int setLayoutResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        btn_principle = IfindViewById(R.id.btn_principle);
        btn_principle.setOnClickListener(this);
        btn_proxy = IfindViewById(R.id.btn_proxy);
        btn_proxy.setOnClickListener(this);
        btn_dynproxy = IfindViewById(R.id.btn_dynicprocy);
        btn_dynproxy.setOnClickListener(this);
        btn_strtegy = IfindViewById(R.id.btn_strategy);
        btn_strtegy.setOnClickListener(this);
        imgProfile = IfindViewById(R.id.imgProfile);
        btn_builder = IfindViewById(R.id.btn_builder);
        btn_builder.setOnClickListener(this);
        btn_factory = IfindViewById(R.id.btn_factory);
        btn_factory.setOnClickListener(this);
        btn_state = IfindViewById(R.id.btn_state);
        btn_state.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_principle:
                Principle();
                break;
            case R.id.btn_proxy:
                ProxyTest();
                break;
            case R.id.btn_dynicprocy:
                dynicProxy();
                break;
            case R.id.btn_strategy:
                strategy();
                break;
            case R.id.btn_factory:
                factory();
                break;
            case R.id.btn_state:
                launchActvity(LoginActvity.class);
            default:
                break;

        }
    }
    /*
     * 工厂模式
     */
    private void factory() {
        Factory factory = new ConcreateFactory();
        Product product = new ProductA();
        product.method();

    }


    /**
     * 六大原则
     */
    private void Principle() {
        ImageLoader imgLodImageLoader = new ImageLoader();

        //设置缓存的方式
        imgLodImageLoader.setmImageCache(new MemoryCache()); //默认方式
        imgLodImageLoader.setmImageCache(new DiskCache());//使用磁盘缓存
        imgLodImageLoader.setmImageCache(new DouleCache());//使用双重缓存
        //使用自定义缓存
        imgLodImageLoader.setmImageCache(new IImageCache() {
            @Override
            public Bitmap get(String url) {
                return null;
            }

            @Override
            public void put(String url, Bitmap bmp) {

            }
        });


        final String imageUrl = Constant.URL_PRIFE;
        imgLodImageLoader.displayImage(imageUrl, imgProfile);


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
