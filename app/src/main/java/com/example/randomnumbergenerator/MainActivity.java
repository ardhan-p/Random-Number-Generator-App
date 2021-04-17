package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editMax = findViewById(R.id.maxNumEdit);
        EditText editMin = findViewById(R.id.minNumEdit);
        TextView viewNum = findViewById(R.id.numberView);
        Button generateNum = findViewById(R.id.generateBtn);

        generateNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();

                String tempMin = editMin.getText().toString();
                int valueMin = 0;
                if(!"".equals(tempMin)) {
                    valueMin = Integer.parseInt(tempMin);
                }

                String tempMax = editMax.getText().toString();
                int valueMax = 0;
                if(!"".equals(tempMax)) {
                    valueMax = Integer.parseInt(tempMax);
                }

                int randomNum = rand.nextInt((valueMax + 1) + valueMin);
                viewNum.setText(String.valueOf(randomNum));

            }
        });
    }
}