package fugoki.com.recyclingfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RecyclingFactsActivity extends AppCompatActivity {

    // هنا سنعرف المتغيرات
    private TextView factTextView;
    private Button factButton;

    String facts[] = {
            "95% من معلومات العالم لاتزال مخزنه على الورق واغلبها لاتتم مشاهدته مرة اخرى",
            "اعادة تدوير قاروة بلاستيك يوفر طاقة كافية لاضاءة مصباح بقدرة 60 واط لمدة 6 ساعات",
            "الاف المخلوقات البحرية تموت بسبب ابتلاعها اكياس البلاستيك التي تشبه قنديل البحر",
            "في كل عام يرمي الامريكان قوارير وزجاجات كافية لوصول القمر والعودة اليه 20 مره",
            "اعادة تدوير طن من البلاستيك يمكن ان يوفر حوالي 2000 غالون من البنزين",
            "بداية من عام 2015 جميع سكان نيويورك عليهم اعادة تدوير الاجهزة الالكترونية والا سيواجهون غرامه مقدارها 100 دولا",
            "اعادة تدوير علبة المنيوم يمكن ان يوفر طاقة تكفي لتشغيل تلفاز لساعتين",
            "اعادة تدوير طن من الورق يحافظ على 17 شجره",
            "اعادة تدوير علبة المنيوم يمكن ان يعيدها الى رف متجر خلال 60 يوم",

            "إبدأ إعادة التدوير بتقليل استخدامك للبلاستك"
    };

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
                // هنا سيتم تغير الجملة في البرنامج
                String fact;
                Random randomGen = new Random();
                int randomNumber = randomGen.nextInt(facts.length);

                fact = facts[randomNumber];

                factTextView.setText(fact);
            }
        };


        // تعين سامع للزر
        factButton.setOnClickListener(onClickListener);
    }
}
