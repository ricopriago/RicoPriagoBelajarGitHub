package com.example.latihanactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //deklarasi komponen
    Button btnClose, btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose = (Button) findViewById(R.id.btn_close);
        btnStart = (Button) findViewById(R.id.btn_start_activity);

        btnClose.setOnClickListener(this);
        btnStart.setOnClickListener(this);

        Toast.makeText(this, "Activity:on Create()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Activity:onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Activity:onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity:onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Activity:onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_start_activity:
                Intent newActivity = new Intent(Intent.ACTION_VIEW);
                newActivity.setData(Uri.parse("https://www.google.com/"));
                startActivity(newActivity);
                break;
            case R.id.btn_close:
                finish();
                break;
        }
    }
}