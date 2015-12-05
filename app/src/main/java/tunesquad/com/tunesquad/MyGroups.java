package tunesquad.com.tunesquad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by shaun.d.clark on 05/12/15.
 */

public class MyGroups extends AppCompatActivity {

    Button createNewSquad;
    Button findSqaud;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_groups);

        createNewSquad = (Button)findViewById(R.id.create_new_sqaud);
        findSqaud = (Button)findViewById(R.id.find_sqaud);

        findSqaud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainIntent = new Intent(MyGroups.this, FindSquad.class);
                MyGroups.this.startActivity(mainIntent);

            }
        });

        createNewSquad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainIntent = new Intent(MyGroups.this, CreateSquad.class);
                MyGroups.this.startActivity(mainIntent);

            }
        });

    }
}
