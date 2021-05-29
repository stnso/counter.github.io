package com.example.counter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
private TextView textView2;
private Button plus1BUtton;
private Button reset;
private Button log;
private  Button save;

int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.textView2);
        plus1BUtton = findViewById(R.id.plus1);
        reset = findViewById(R.id.reset);
        save = findViewById(R.id.save);
        log = findViewById(R.id.log);
        number = 0;


        textView2.setText(number + "");
        plus1BUtton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number++;
                textView2.setText(number + "");
                reset.setOnClickListener(v1 -> {
                    number = 0;
                    textView2.setText(number + "");
                    log.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View V) {
                            Intent intent = new
                                    Intent(getApplication(), subactivity.class);
                            startActivity(intent);
                        }
                    });
                });
            }
        });
    }}
