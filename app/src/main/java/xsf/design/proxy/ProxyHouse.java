package xsf.design.proxy;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/12.
 * Copyright 2016 Netease. All rights reserved.
 */
public class ProxyHouse implements IHouse {

    private IHouse house;

    public ProxyHouse(IHouse house) {
        //里氏替换,依赖倒转(面向接口)
        this.house = house;
    }

    @Override
    public void getHouseInfo() {

        house.getHouseInfo();

    }

    @Override
    public void signContract() {
        
        house.signContract();

    }

    @Override
    public void payFees() {
        house.payFees();
    }
}
