package ros.dab.troll.myliverpg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initOnClickListeners();
    }

    private void initOnClickListeners() {
        findViewById(R.id.login_button).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if(viewId == R.id.login_button){
            EditText loginEditText = (EditText) findViewById(R.id.login_edittext);
            String loginText = loginEditText.getText().toString();

            EditText passwordEditText = (EditText) findViewById(R.id.password_edittext);
            String password = passwordEditText.getText().toString();

            if(loginText.equals("admin") && password.equals("password")){
                Intent intent = new Intent(this, ListActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Inappropiate identification", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
