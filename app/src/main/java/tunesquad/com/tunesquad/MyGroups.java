package tunesquad.com.tunesquad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by shaun.d.clark on 05/12/15.
 */

public class MyGroups extends AppCompatActivity {

    private Button createNewSquad;
    private Button findSqaud;
    private VolleyManager vm = new VolleyManager();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_groups);


        //vm.sendDataToEndpoint(MyGroups.this, stringBuilder("tunesqaudfinal-env.elasticbeanstalk.com/public/index.php?apikey=spacejam"));

        createNewSquad = (Button) findViewById(R.id.create_new_sqaud);
        findSqaud = (Button) findViewById(R.id.find_sqaud);

        findSqaud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainIntent = new Intent(MyGroups.this, PlayMusic.class);
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

    public StringRequest stringBuilder(String url) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.i("Network Response", response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Error handling
                System.out.println("Something went wrong!");
                error.printStackTrace();

            }
        });
        return stringRequest;
    }
}
