package com.example.animacja2;

import static java.lang.System.in;
import static java.lang.System.out;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDrzewiec;
    private Button buttonObrot;
    private Button buttonPowieksz;
    private Button buttonZnikanie;
    private Button buttonKoniec;
    private RadioGroup mRadioGroup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageDrzewiec = findViewById(R.id.drzewiec);
        buttonObrot = findViewById(R.id.obrot);
        buttonPowieksz = findViewById(R.id.powieksz);
        buttonZnikanie = findViewById(R.id.znikanie);
        buttonKoniec = findViewById(R.id.end);
        mRadioGroup = (RadioGroup) findViewById(R.id.menu);
        Button clearButton = (Button) findViewById(R.id.end);
        clearButton.setOnClickListener((View.OnClickListener) this);

        startAnime();
        startOnClick();
        startOnClick2();
        startOnClick3();
        startOnclick4();
    }


    private void startAnime() {


    }

    private void startOnClick() {
        super.findViewById(R.id.powieksz);
        buttonPowieksz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation out = new ScaleAnimation(1f, 2f, 1f, 2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                out.setFillAfter(true);
                out.setDuration(4000);
                Animation in = new AlphaAnimation(1, 0);
                in.setDuration(0);

                out.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(MainActivity.this, "Stare mistyczne drzewo - powiększanie", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(in);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                });
                in.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(out);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                imageDrzewiec.startAnimation(out);
            }
        });


    }

    private void startOnClick2() {
        super.findViewById(R.id.obrot);
        buttonObrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation out = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                out.setDuration(5000);
                out.setInterpolator(new LinearInterpolator());
                Animation in = new AlphaAnimation(1, 0);

                out.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(MainActivity.this, "Stare mistyczne drzewo - obrót", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(in);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                });
                in.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(out);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                imageDrzewiec.startAnimation(out);
            }
        });


    }

    private void startOnClick3() {
        super.findViewById(R.id.znikanie);
        buttonZnikanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation out = new ScaleAnimation(1f, 2f, 1f, 2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                out.setFillAfter(true);
                out.setDuration(0);
                Animation in = new AlphaAnimation(1, 0);
                in.setDuration(4000);

                out.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(MainActivity.this, "Stare mistyczne drzewo - znikanie", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(in);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                });
                in.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(out);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                imageDrzewiec.startAnimation(out);
            }
        });


    }

    private void startOnclick4() {
        super.findViewById(R.id.end);
        buttonKoniec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation out = new ScaleAnimation(1f, 1f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                out.setFillAfter(true);
                out.setDuration(4000000);
                Animation in = new AlphaAnimation(1, 0);
                in.setDuration(40000000);

                out.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(MainActivity.this, "Stare mistyczne drzewo - zatrzymanie", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(in);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                });
                in.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageDrzewiec.startAnimation(out);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                imageDrzewiec.startAnimation(out);
            }
        });
    }
}