package xsf.design.State;

import android.content.Context;
import android.widget.Toast;

/**
 * Author: 彩笔学长
 * Time: created at 23/11/2016.
 * Description:
 */

public class LoginState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "评论博客", Toast.LENGTH_SHORT).show();

    }
}
