package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent e = new Intent(this, ExplicitIntentActivity.class);
        startActivity(e);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent i = new Intent(this, ImplicitIntentActivity.class);
        startActivity(i);
    }


    public void handleActivityBundle(View view) {
        Intent b = new Intent(this, BundleActivity.class);
        startActivity(b);
    }

    public void handleParcellable(View view) {
        Intent p = new Intent(this, ProfileParcelableActivity.class);
        startActivity(p);

    }
}
