package com.example.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void selecionar(View view){
        Intent intent = new Intent(Main3Activity.this, Main6Activity.class);
        intent.putExtra("base", findViewById(R.id.editText2).toString());
        intent.putExtra("altura", findViewById(R.id.editText3).toString());
        startActivity(intent);
    }
}
