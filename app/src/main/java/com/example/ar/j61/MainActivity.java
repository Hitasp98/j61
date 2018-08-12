package com.example.ar.j61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton R1;
    RadioButton R2;
    RadioButton R3;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = (ImageView) findViewById(R.id.im1);

    }


    public void onlie1(View V) {
        i1.setImageResource(R.drawable.car1);

    }

    public void onlie2(View V) {

        i1.setImageResource(R.drawable.car2);

    }

    public void onlie3(View V) {
        i1.setImageResource(R.drawable.car3);

    }
}
