package com.example.converterpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText kg = findViewById(R.id.kg);
        final EditText pound = findViewById(R.id.pound);
       final  Button swap = findViewById(R.id.swap);

      swap.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if(kg.getText().toString().length()==0)
              {
                  double b= Double.parseDouble(pound.getText().toString().trim());
                  kg.setText(Double.toString(b*0.453));
                  pound.setText("");
              }

              else
              {
                  double n=Double.parseDouble(kg.getText().toString().trim());
                  pound.setText(Double.toString(n*2.205));
                  kg.setText("");
              }
          }
      });
    }
}