package com.example.examen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String EXTRA_MESSAGE = "mensaje extra";
    static final String EXTRA_SAVED = "mensaje SAVED";
    static final int TEXT_REQUEST = 1;

    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView2);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchS();
            }
        });

//        if (savedInstanceState != null){
//            String msg2 = savedInstanceState.getString("regresa","no hay");
//            txt.setText(msg2);
//        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST){
            String str = data.getStringExtra("regresa");
            txt.setText(str);
        }
    }

    public void launchS(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

}