package com.thinkpinkcode.catfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    }



}
