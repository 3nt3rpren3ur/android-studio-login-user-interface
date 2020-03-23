package com.likhith.LoginInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text=findViewById(R.id.text);
        textanimation();
    }
    public void textanimation()
    {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.anim);
        text.startAnimation(animation);
    }

}
