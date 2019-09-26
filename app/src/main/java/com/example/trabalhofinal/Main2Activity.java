package com.example.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void selecionar(View view){
        Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
        intent.putExtra("raio", findViewById(R.id.editText).toString());
        startActivity(intent);
    }
}