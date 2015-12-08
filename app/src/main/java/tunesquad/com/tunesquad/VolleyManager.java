package tunesquad.com.tunesquad;

import android.content.Context;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by shaun.d.clark on 05/12/15.
 */
public class VolleyManager {

    public static void sendDataToEndpoint(Context context, StringRequest endpoint) {

        // Add the request to the queue
        Volley.newRequestQueue(context).add(endpoint);
    }

}

