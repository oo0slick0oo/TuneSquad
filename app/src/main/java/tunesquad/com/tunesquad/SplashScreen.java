package tunesquad.com.tunesquad;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import humm.android.api.HummAPI;
import humm.android.api.Model.Humm;

public class SplashScreen extends AppCompatActivity {

    // Scope...
    private static final String USERNAME = "oo0slick0oo";
    private static final String PASSWORD = "Liberty2";
    private static final String LOG_TAG = "SplashScreen";
    private static final long SPLASH_DISPLAY_LENGTH = 2000; // Currently 2 seconds


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        init();
        // This is the main method.. start here ^^ leave the above

        final HummAPI humm = HummAPI.getInstance();

        humm.

    }

    public void init() {

        // Hides Actionbar
        getSupportActionBar().hide();

/*
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, FacebookNetwork.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
*/

    }

}
