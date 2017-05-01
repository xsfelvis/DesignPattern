package xsf.design.command;

/**
 * Author: xushangfei
 * Time: created at 2017/5/1.
 * Description:
 */

public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
