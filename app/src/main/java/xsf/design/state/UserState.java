package xsf.design.state;

import android.content.Context;

/**
 * Author: 彩笔学长
 * Time: created at 23/11/2016.
 * Description:
 */

public interface UserState {
    public void forward(Context context);
    public void comment(Context context);
}
