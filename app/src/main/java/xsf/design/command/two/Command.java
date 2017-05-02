package xsf.design.command.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public abstract class Command {
    protected RequireGroup requireGroup = new RequireGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();
}
