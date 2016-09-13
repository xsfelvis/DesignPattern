package xsf.design.Builder;

/**
 * 抽象builder
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public abstract class Builder {
    //设置主机
    public abstract Builder buildBoard(String board);
    //设置显示器
    public abstract Builder buildDisplay(String display);
    //显示操作系统
    public abstract Builder buildos(String os);
    public abstract Computer create();
}
