package xsf.design.factory.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public abstract class AbstractHumanFactory {
    /**
     *
     * @param c 必须是Class类型
     * @param <T> 必须是IHuman实现类
     * @return
     */
    public abstract <T extends IHuman> T createHuman(Class<T> c);
}
