package tunesquad.com.tunesquad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import humm.android.api.HummAPI;
import humm.android.api.OnActionFinishedListener;

public class SplashScreen extends AppCompatActivity {

    // Scope...
    private HummAPI humm;
    private static final String userName = "oo0slick0oo";
    private static final String password = "Liberty2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // This is the main method.. start here ^^ leave the above

        humm = HummAPI.getInstance();

        if (humm != null){
            // HUMM api has been initilized
        } else {
            Toast toast = Toast.makeText(this, "error", Toast.LENGTH_LONG);
            toast.show();
        }

        humm.login(userName, password, new OnActionFinishedListener() {
            @Override
            public void actionFinished(Object o) {
                Toast toast = Toast.makeText(SplashScreen.this, "Login Complete", Toast.LENGTH_LONG);
                toast.show();
            }

            @Override
            public void onError(Exception e) {
                Toast toast = Toast.makeText(SplashScreen.this, "Login Failed", Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }





}
