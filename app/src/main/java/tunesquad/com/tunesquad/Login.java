package tunesquad.com.tunesquad;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import humm.android.api.HummAPI;
import humm.android.api.OnActionFinishedListener;

public class Login extends AppCompatActivity {

    private static final String USERNAME = "oo0slick0oo";
    private static final String PASSWORD = "Liberty2";
    final HummAPI humm = HummAPI.getInstance();
    private EditText username;
    private EditText password;
    private Button loginButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        loginButton = (Button)findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                humm.login(username.getText().toString(), password.getText().toString(), new OnActionFinishedListener() {
                    @Override
                    public void actionFinished(Object o) {

                        Intent intent = new Intent(Login.this, MyGroups.class);
                        Login.this.startActivity(intent);
                        Login.this.finish();
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast toast = Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_LONG);

                    }
                });

            }
        });



    }
}
