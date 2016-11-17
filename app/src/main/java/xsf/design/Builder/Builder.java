package xsf.design.Builder;

/**
 * 抽象builder
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisplay(String display);
    //显示操作系统
    public abstract void buildos(String os);
    public abstract Computer create();
}
