package com.robot.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.robot.databinding.databinding.LaosijiBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LaosijiBinding binding = DataBindingUtil.setContentView(this, R.layout.laosiji);
        OldDriver oldDriver = new OldDriver("Xman", "吱吱");
        binding.setOldDriver(oldDriver);
        MyHandler myHandler = new MyHandler(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "xxx", Toast.LENGTH_SHORT).show();
            }
        };
        binding.setHandlers(myHandler);
        binding.xman.setText("隔壁喵叔");

    }

    public void test(View v) {
        Boy boy = new Boy();
        boy.name = "jack";
        boy.school = "No.1";
        boy.tall = 178;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("data", boy);
        startActivity(intent);
    }
}
