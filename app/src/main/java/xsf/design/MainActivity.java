package xsf.design;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import xsf.design.builder.Builder;
import xsf.design.builder.Win7Builder;
import xsf.design.principle.DiskCache;
import xsf.design.principle.DouleCache;
import xsf.design.principle.IImageCache;
import xsf.design.principle.ImageLoader;
import xsf.design.principle.MemoryCache;
import xsf.design.proxy.House;
import xsf.design.proxy.IHouse;
import xsf.design.proxy.ProxyHandler;
import xsf.design.proxy.ProxyHouse;
import xsf.design.strategy.BackDoor;
import xsf.design.strategy.BlockEnemy;
import xsf.design.strategy.GreenLight;
import xsf.design.strategy.StrategyManager;
import xsf.design.base.BaseActvity;
import xsf.design.util.Constant;

public class MainActivity extends BaseActvity {
    private Button btn_principle;
    private Button btn_proxy;
    private Button btn_dynproxy;
    private Button btn_strtegy;
    private Button btn_builder;

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
            case R.id.btn_builder:
                builder();
                break;
        }
    }

    /**
     * 建造者模式
     */
    private void builder() {
        Builder builder = new Win7Builder();
        //Director pcDirector = new Director(builder);
       // pcDirector.construct("i7", "sunsang");
        //System.out.printf("pc config " + pcDirector.toString());
        builder.buildBoard("i7").buildDisplay("sansung").buildos("win7 64").create();
        //System.out.printf("pc config " + builder.buildBoard("i7").buildDisplay("sansung").create().toString());
        Log.i("builder",builder.buildBoard("i7").buildDisplay("sansung").create().toString());


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
