package tunesquad.com.tunesquad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gregdikopf on 12/5/15.
 */
public class CreateHomeScreen  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_sqaud);

    }

    public void StartActivity(){
        Intent intent = new Intent(CreateHomeScreen.this, CreateSquad.class);
        CreateHomeScreen.this.startActivity(intent);
    }
}
