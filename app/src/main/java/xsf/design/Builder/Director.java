package xsf.design.Builder;

/**
 * Author: hzxushangfei
 * Time: created at 2016/9/13.
 * Copyright 2016 Netease. All rights reserved.
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void  construct(String board,String display){
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.create();
    }

}
