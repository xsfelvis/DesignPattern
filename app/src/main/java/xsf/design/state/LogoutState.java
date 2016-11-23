package xsf.design.State;

import android.content.Context;
import android.content.Intent;

/**
 * Author: 彩笔学长
 * Time: created at 23/11/2016.
 * Description:
 */

public class LogoutState implements UserState{
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context,LoginActvity.class);
        context.startActivity(intent);
    }
}
