package tunesquad.com.tunesquad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.facebook.FacebookSdk;

/**
 * Created by Melissa Zhang on 12/5/2015.
 */
public class FacebookNetwork extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.login);


    }
}
