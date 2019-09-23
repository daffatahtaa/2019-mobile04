package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    private TextView textView;
    private TextView textOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        textView = findViewById(R.id.input_name2);
        textOut = findViewById(R.id.text_output);


    }

    public void handleSubmit(View view) {
        String name = textView.getText().toString();
        textOut.setText("Hello " + name);
    }
}
