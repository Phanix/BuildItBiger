package project.com.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayJoke extends AppCompatActivity {

    public static final String JOKE_EXTRA = "extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        //Get extra string from intent
        String extraJoke = getIntent().getStringExtra(JOKE_EXTRA);

        //Get reference from textView
        TextView textView = findViewById(R.id.tv_joke);
        textView.setText(extraJoke);

    }
}
