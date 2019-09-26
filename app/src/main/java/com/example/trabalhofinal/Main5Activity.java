package com.example.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        int raio = Integer.valueOf(this.getIntent().getStringExtra("raio"));
        double area = (4.14 * (raio*raio));
        TextView result = findViewById(R.id.textView6);
        result.setText("Área: "+area+"cm²");
    }

    public void recomecar(View view){
        Intent intent = new Intent(Main5Activity.this, MainActivity.class);
    }
}
