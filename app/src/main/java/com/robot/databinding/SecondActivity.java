package com.robot.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.robot.databinding.databinding.LaosijiBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        Boy boy = (Boy)bundle.get("data");
        System.out.println(boy.school);
        System.out.println(boy.name);
        System.out.println(boy.tall);

        ContextCompat.getColor(this, R.color.colorAccent);
    }

}
