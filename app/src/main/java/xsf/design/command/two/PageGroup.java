package xsf.design.command.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("客户增加一项需求");
    }

    @Override
    public void change() {
        System.out.println("客户修改一项需求");
    }

    @Override
    public void delete() {
        System.out.println("客户删除一项需求");

    }

    @Override
    public void plan() {
        System.out.println("客户需求变更一项需求");
    }
}
