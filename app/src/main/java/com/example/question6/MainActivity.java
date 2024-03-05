package com.example.question6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView = findViewById(R.id.Textview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                // Define the four floating-point numbers
                float num1 = 10.5f;
                float num2 = 15.3f;
                float num3 = 20.7f;
                float num4 = 8.2f;

                // Calculate the average
                float average = (num1 + num2 + num3 + num4) / 4;

                // Display the average in a TextView

                textView.setText(" Average of the four numbers: " + average);
            }
        }

