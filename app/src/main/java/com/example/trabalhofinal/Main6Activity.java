package com.example.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        int base = Integer.valueOf(this.getIntent().getStringExtra("base"));
        int altura = Integer.valueOf(this.getIntent().getStringExtra("altura"));
        int area = (base * altura)/2;
        TextView result = findViewById(R.id.textView6);
        result.setText("Área: "+area+"cm²");
    }
    public void recomecar(View view){
        Intent intent = new Intent(Main6Activity.this, MainActivity.class);
    }
}
