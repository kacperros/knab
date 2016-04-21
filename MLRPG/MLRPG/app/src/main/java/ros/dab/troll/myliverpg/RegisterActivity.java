package ros.dab.troll.myliverpg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Bartek on 2016-04-21.
 */
public class RegisterActivity extends AppCompatActivity {

    @Bind(R.id.user_edittext)
    EditText userEditText;

    @Bind(R.id.enterPassword_edittext)
    EditText enterPasswordEditText;

    @Bind(R.id.repeatPassword_edittext)
    EditText repeatPasswordEditText;

    @Bind(R.id.enterEmail_edittext)
    EditText enterEmailEditText;

    @Bind(R.id.register_button2)
    Button registerButton2;

    @OnClick(R.id.register_button2)
    public void onClickRegisterButton2() {

        String userText = userEditText.getText().toString();
        String enterPasswordText = enterPasswordEditText.getText().toString();
        String repeatPasswordText = repeatPasswordEditText.getText().toString();

        if (enterPasswordText.equals(repeatPasswordText)) {

        }else{
            Toast.makeText(this, "niezgodne hasla",Toast.LENGTH_SHORT).show();
            return;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();

        String loginText = bundle.getString("loginText");
        String passwordText = bundle.getString("passwordText");

        userEditText.setText(loginText);
        enterPasswordEditText.setText(passwordText);
    }
}
