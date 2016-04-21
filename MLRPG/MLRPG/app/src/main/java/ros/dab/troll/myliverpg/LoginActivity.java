package ros.dab.troll.myliverpg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity{
    @Bind(R.id.login_button)
    Button loginButton;

    @Bind(R.id.register_button)
    Button registerButton;

    @Bind(R.id.login_edittext)
    TextView loginEditText;

    @Bind(R.id.password_edittext)
    TextView passwordEditText;


    @OnClick(R.id.login_button)
    public void onClickLoginButton() {

        String loginText = loginEditText.getText().toString();
        String passwordText = passwordEditText.getText().toString();

        if (loginText.equals("") || passwordText.equals("") ) {
            Toast.makeText(this, "Enter a login or password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (loginText.equals("admin") && passwordText.equals("password")) {
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Inappropriate identification", Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.register_button)
    public void onClickRegisterButton(){
        Intent intent = new Intent(this, RegisterActivity.class);

        String loginText = loginEditText.getText().toString();

        intent.putExtra("loginText", loginText);

        startActivity(intent);
    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


}
