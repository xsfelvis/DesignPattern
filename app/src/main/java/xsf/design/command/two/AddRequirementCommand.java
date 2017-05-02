package xsf.design.command.two;

/**
 * Author: xushangfei
 * Time: created at 2017/5/2.
 * Description:
 */

public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.requireGroup.find();
        super.requireGroup.add();
        super.requireGroup.plan();
    }
}
