package tunesquad.com.tunesquad;

import android.content.Intent;
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

        Intent intent = new Intent(this, FacebookNetwork.class);
        startActivity(intent);

    }
}
