package xsf.design.builder;

/**
 * 计算机的抽象类
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public abstract class Computer {
    protected String board;
    protected String disPlay;
    protected String os;

    protected Computer(){}

    public void setBoard(String board) {
        this.board = board;
    }

    public void setDisPlay(String disPlay) {
        this.disPlay = disPlay;
    }

    public void setOs(String os){this.os = os;}

    @Override
    public String toString() {
        return "Computer{" +
                "board='" + board + '\'' +
                ", disPlay='" + disPlay + '\'' +
                ",os="+os+'\''+
                '}';
    }
}
