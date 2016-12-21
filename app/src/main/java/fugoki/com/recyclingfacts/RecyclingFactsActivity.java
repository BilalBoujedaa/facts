package fugoki.com.recyclingfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclingFactsActivity extends AppCompatActivity {

    // هنا سنعرف المتغيرات
    private TextView factTextView;
    private Button factButton;

    private RecyclingFactsGenerator recyclingFactsGenerator = new RecyclingFactsGenerator();

    private static final String TAG = "TAG_FACT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycling_facts);

        // تعين المتغيرات
        factTextView = (TextView) findViewById(R.id.factTextView);
        factButton = (Button) findViewById(R.id.factButton);

        // تعريف السامع
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = recyclingFactsGenerator.generateFact();

                factTextView.setText(fact);

                Toast.makeText(RecyclingFactsActivity.this, getResources().getString(R.string.button_pressed), Toast.LENGTH_SHORT).show();
            }
        };


        // تعين سامع للزر
        factButton.setOnClickListener(onClickListener);

        Toast.makeText(RecyclingFactsActivity.this, getResources().getString(R.string.app_started), Toast.LENGTH_LONG).show();

        Log.e(TAG, "Our app crashed!");
    }
}
