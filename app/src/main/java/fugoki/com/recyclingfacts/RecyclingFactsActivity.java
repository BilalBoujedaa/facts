package fugoki.com.recyclingfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class RecyclingFactsActivity extends AppCompatActivity {

    // هنا سنعرف المتغيرات
    private TextView factTextView;
    private Button factButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycling_facts);

        // تعين المتغيرات
        factTextView = (TextView) findViewById(R.id.factTextView);
        factButton = (Button) findViewById(R.id.factButton);
    }
}
