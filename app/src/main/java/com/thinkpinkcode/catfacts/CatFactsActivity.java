package com.thinkpinkcode.catfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class CatFactsActivity extends AppCompatActivity {

    //Declare our view variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_facts);

        //Assign views from the layout file to the corresponding variable

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //The button was clicked, so update the fact TextView with a new fact.
                //Randomly select a fact
                Random randomgenerator = new Random();
                int randomNumber = randomgenerator.nextInt();

                String fact = "";

                //Update the screen with the new fact
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);

    }



}
