package com.lieber.androidmvp.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lieber.androidmvp.R;
import com.lieber.androidmvp.mvp.model.LoginBean;
import com.lieber.androidmvp.mvp.presenter.Login1ActView;
import com.lieber.androidmvp.mvp.presenter.Login1PresenterImp;


public class Login1Act extends AppCompatActivity implements Login1ActView {
    private final static String TAG = Login1Act.class.getSimpleName();
    private EditText userName, passWord;
    private Button btnLogin;
    private Login1PresenterImp mPresenter;
    private Activity mAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        mAct = this;
        userName = (EditText) findViewById(R.id.et_user_name);
        passWord = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(clickListener);
        mPresenter = new Login1PresenterImp(this);
    }

    @Override
    public void loginSuccess(LoginBean loginBean) {
        btnLogin.setText("Login");
        Log.d(TAG, String.format("result: %s", loginBean.getMsg()));
        Toast.makeText(mAct, "login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed(LoginBean loginBean) {
        Log.d(TAG, String.format("error code:%s | error body: %s", loginBean.getStatus(), loginBean.getMsg()));
        Toast.makeText(mAct, "login failed", Toast.LENGTH_SHORT).show();

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_login:
                    if (mPresenter != null) {
                        btnLogin.setText("Logining ...");
                        mPresenter.login(userName.getText().toString(), passWord.getText().toString());
                    }
                    break;
                default:
                    break;
            }
        }
    };
}
