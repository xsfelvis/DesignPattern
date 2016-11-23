package xsf.design.State;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import xsf.design.Base.BaseActvity;
import xsf.design.R;


public class LoginActvity extends BaseActvity {

    private EditText edName, edPwd;
    private Button btnLogin;

    @Override
    protected int setLayoutResourceId() {
        return R.layout.activity_login_actvity;
    }

    @Override
    protected void initView() {
        edName = IfindViewById(R.id.et_name);
        edPwd = IfindViewById(R.id.et_pwd);
        btnLogin = IfindViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_login:
                login();

                break;
            default:
                break;
        }
    }

    private void login() {
        String userName = edName.getText().toString().trim();
        String userPwd = edPwd.getText().toString().trim();

        if ("xsf".equals(userName) && "123".equals(userPwd)) {
            LoginContext.getInstance().setLoginContext(new LoginState());
            Toast.makeText(this, "强势登陆", Toast.LENGTH_SHORT).show();
            launchActvity(ContentActivity.class);
        } else {
            Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
        }


    }
}
