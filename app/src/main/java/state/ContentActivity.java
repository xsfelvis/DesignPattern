package state;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import xsf.design.R;
import xsf.design.base.BaseActvity;

public class ContentActivity extends BaseActvity {
    private Button btn_push, btn_logout;

    @Override
    protected int setLayoutResourceId() {
        return R.layout.activity_content;
    }

    @Override
    protected void initView() {
        btn_push = IfindViewById(R.id.btn_forward);
        btn_push.setOnClickListener(this);
        btn_logout = IfindViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_forward:
                LoginContext.getInstance().forward(ContentActivity.this);
                break;
            case R.id.btn_logout:
                LoginContext.getInstance().setLoginContext(new LogoutState());
                Toast.makeText(this, "状态设置为未登录", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }


}
