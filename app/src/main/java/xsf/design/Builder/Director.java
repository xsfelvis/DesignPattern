package xsf.design.Builder;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
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
