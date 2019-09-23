package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import model.User;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView textUsername;
    private TextView textName;
    private TextView textAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        // TODO: bind here
        textUsername = findViewById(R.id.text_username);
        textName = findViewById(R.id.text_name);
        textAge = findViewById(R.id.text_age);

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            textUsername.setText(user.getUsername());
            textName.setText(user.getName());
            textAge.setText(String.valueOf(user.getAge()));
        }
    }
}
