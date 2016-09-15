package app.com.example.android.displayjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    public static final String INTENT_STRING_ID = "joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent displayIntent = getIntent();
        TextView jokeTxtView = (TextView) findViewById(R.id.jokeTextView);
        if (jokeTxtView != null) {
            jokeTxtView.setText(displayIntent.getStringExtra(INTENT_STRING_ID));
        }
    }
}
