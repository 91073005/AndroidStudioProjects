package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields

    // Buttons
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        // references

        //TextViews
        TextView textView_story     =  (TextView) findViewById(R.id.textView_story);
        TextView textView_question  = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
        textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");

        // Buttons
        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);

        leftButton.setText("Backyard");
        rightButton.setText("Toilet");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
    }// end of onCreate() method

    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            // send them to the Wake up Activity
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.button_right)
        {
            // send them to Explore Activity
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
    }// end of onClick
}
