package tunesquad.com.tunesquad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by gregdikopf on 12/5/15.
 */
public class CreateGroup  extends AppCompatActivity {
    Button createButton;
    EditText createInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createButton = (Button)findViewById(R.id.create_button);
        createInput = (EditText)findViewById(R.id.create_input);

        createButton.setOnClickListener(new View.OnClickListener() {
            String name;
            @Override
            public void onClick(View v) {
                name = createInput.getText().toString();
                String key = newKey();
                create(name, key);
                Log.d("", "input = " + name);

            }
        });

    }

    public void create(String name, String key){
        //query database with name and key to add group
    }
    public String newKey(){
        //randomly generate key; check if key in database; if key in database, generate new key; else return key
        return "";
    }
}
