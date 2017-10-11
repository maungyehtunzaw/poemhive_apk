package poemhive.dream.yehtun.poemhive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PoemDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_detail);
        TextView tv1=(TextView)findViewById(R.id.tv_title);
        Intent intent=getIntent();

        tv1.setText(intent.getStringExtra("poemtitle"));

    }
}
