package xsf.design.factory.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends IHuman> T createHuman(Class<T> c) {
        IHuman human = null;
        try {
            human = (IHuman) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
