package tunesquad.com.tunesquad;

import android.content.Intent;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import humm.android.api.HummAPI;
import humm.android.api.Model.Humm;
import humm.android.api.OnActionFinishedListener;

public class SplashScreen extends AppCompatActivity {

    // Scope...
    private static final String LOG_TAG = "SplashScreen";
    private static final long SPLASH_DISPLAY_LENGTH = 6000; // Currently 2 seconds


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        init();

    }



    public void init() {

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, Login.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
