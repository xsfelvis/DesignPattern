package xsf.design.state;

import android.content.Context;

/**
 * Author: 彩笔学长
 * Time: created at 23/11/2016.
 * Description:
 */

public class LoginContext {
    //用户状态，默认为未登录状态
    UserState userState = new LogoutState();

    public LoginContext() {
    }


    private static class SingleHolder {
        private static final LoginContext instance = new LoginContext();
    }

    //对外提供调用的功能函数

    //单例
    public static LoginContext getInstance() {
        return SingleHolder.instance;
    }

    public void forward(Context context) {
        userState.forward(context);
    }

    public void comment(Context context) {
        userState.comment(context);
    }

    public void setLoginContext(UserState userState) {
        this.userState = userState;
    }


}
