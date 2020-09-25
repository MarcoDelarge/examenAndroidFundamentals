package com.example.examen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);


        btn1 = findViewById(R.id.button2);
        btn1.setTag(R.id.button2,"1");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reply(String.valueOf(btn1.getText()));
            }
        });
        btn2 = findViewById(R.id.button3);
        btn2.setTag(R.id.button3,"2");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reply(String.valueOf(btn2.getText()));
            }
        });
        btn3 = findViewById(R.id.button4);
        btn3.setTag(R.id.button4,"3");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reply(String.valueOf(btn3.getText()));
            }
        });


    }

    public void reply(String s){
        Intent reply1 = new Intent();
//        reply1.putExtra("regresa",String.valueOf(v.getTag()));
        reply1.putExtra("regresa",s);
//        Log.i("MARCO",String.valueOf(v.getTag()));
        Log.i("MARCO",s);
        setResult(RESULT_OK, reply1);
        finish();
    }
}
