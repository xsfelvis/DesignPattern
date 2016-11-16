package xsf.design.Builder;

/**
 * Author: 彩笔学长
 * Time: created at 2016/9/13.
 */
public class Win7Builder extends Builder {
    private WindowsComputer windows = new WindowsComputer();

    @Override
    public Win7Builder buildBoard(String board) {
        windows.setBoard(board);
        return this;

    }

    @Override
    public Win7Builder buildDisplay(String display) {
        windows.setDisPlay(display);
        return this;

    }

    @Override
    public Builder buildos(String os) {
        windows.setOs(os);
        return this;
    }

    @Override
    public Computer create() {
        return windows;
    }
}
