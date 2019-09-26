package com.example.trabalhofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selecionar(View view){
        RadioGroup radioId = findViewById(R.id.radioGroup2);
        int radio = radioId.getCheckedRadioButtonId();

        if(radio==0){
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        } else if(radio==1){
            Intent intent = new Intent(MainActivity.this, Main3Activity.class);
            startActivity(intent);
        } else if(radio==2){
            Intent intent = new Intent(MainActivity.this, Main4Activity.class);
            startActivity(intent);
        }
    }
}
