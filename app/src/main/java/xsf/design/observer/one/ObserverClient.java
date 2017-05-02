package xsf.design.observer.one;

/**
 * Author: 彩笔学长
 * Time: created at 23/11/2016.
 * Description:
 */

public class ObserverClient {
    public static void main(String[] args) {
        DevTech devTech = new DevTech();
        //观察者
        Coder xsf = new Coder("xsf");
        Coder tom = new Coder("tom");
        Coder gray = new Coder("gray");
        //将观察者注册到可观察队列列表中
        devTech.addObserver(xsf);
        devTech.addObserver(tom);
        devTech.addObserver(gray);

        //发布消息
        devTech.postNewPublication("新的技术博客更新啦!");
    }
}
