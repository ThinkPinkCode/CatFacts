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


                String[] facts = {
                        "Cats have been domesticated for around 4,000 years.",
                        "More cats are left-pawed than right.",
                        "Cats have 32 muscles in their ears (humans have only 12).",
                        "Cats are the most popular pet in the UK and in the US.",
                        "A group of full-grown cats is called a clowder.",
                        "The musical Cats is based on a 1939 collection of T.S. Eliot poems called Old Possum’s Book of Practical Cats.",
                        "The average running feline can clock around 30 mph",
                        "If you went to college, you’re 1.36 times more likely to have a cat than a dog.",
                        "A cat has 244 bones in its entire body—even more than a human, who only has 206 bones.",
                        "Cats are genetically predisposed to not be able to taste sweets.",
                        "Feral cats roam the grounds of Disneyland, where they help control the amusement park’s rodent population.",
                        "The Hungarian word for \"quotation marks,\" macskaköröm, literally translates to \"cat claws.\""
                };

                int randomNumber = randomgenerator.nextInt(facts.length);
                String fact = facts[randomNumber];

                //Update the screen with the new fact
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);

    }



}
