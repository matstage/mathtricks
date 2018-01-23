package com.example.matstage.mathtricks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mathChoiceButton;
        mathChoiceButton = findViewById(R.id.spinner);
        mathChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });



        Button executeBtn = findViewById(R.id.executeButton);
        executeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberEditText);
                EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);

                TextView resultTextview = (TextView) findViewById(R.id.resulttextView);

                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                int result = num1 + num2;

                resultTextview.setText(result + "");
            }
        });

    }
}
