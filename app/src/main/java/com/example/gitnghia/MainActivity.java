package com.example.gitnghia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mapping();
//        text=(TextView)findViewById(R.id.text);
        text = findViewById(R.id.text);
        text.setText("Hi There!!!");
    }

//    private void mapping() {
////        text.findViewById(R.id.text);
//        text=(TextView)findViewById(R.id.text);
//    }
}