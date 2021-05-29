package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class subactivity extends AppCompatActivity {
    private Button finish;
    private TextView log2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        finish=findViewById(R.id.finish);
        log2=findViewById(R.id.textView5);
        finish.setOnClickListener(new View.OnClickListener(){
                    @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}


