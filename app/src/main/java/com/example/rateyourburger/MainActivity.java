package com.example.rateyourburger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RatingBar myRatingBar;
    TextView myTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRatingBar = findViewById(R.id.ratingBar);
        myTextView = findViewById(R.id.textView);
    }

    public void submitRate(View view)
    {

        float ratingValue = myRatingBar.getRating();

        if(ratingValue>0 && ratingValue<=2)
        {
            myTextView.setText("Rating: "+ratingValue+"\nWe'll definitely try our best to impress you next time.");
        }

        else if(ratingValue>=2 && ratingValue<3)
        {
            myTextView.setText("Rating: "+ratingValue+"\nWe're constantly improving.");
        }

        else if(ratingValue>=3 && ratingValue<=4.5)
        {
            myTextView.setText("Rating: "+ratingValue+"\nNext time you'll love us even better.");
        }


        else if(ratingValue>4.5 && ratingValue<=5)
        {
            myTextView.setText("Rating: "+ratingValue+"\nThank you so much for always trusting us.");
        }

        else
        {
            myTextView.setText("Please, rate us.");
        }

    }
}