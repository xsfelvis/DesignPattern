package xsf.design.builder;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public class Win7Builder extends Builder {
    private Computer windows = new WindowsComputer();

    @Override
    public void buildBoard(String board) {
        windows.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        windows.setDisPlay(display);
    }

    @Override
    public void buildos(String os) {
        windows.setOs(os);
    }


    @Override
    public Computer create() {
        return windows;
    }
}
