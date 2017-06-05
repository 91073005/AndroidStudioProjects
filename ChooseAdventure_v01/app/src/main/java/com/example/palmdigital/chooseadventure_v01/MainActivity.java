package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields

    // Buttons
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // references

        //TextViews
        TextView textView_story     =  (TextView) findViewById(R.id.textView_story);
        TextView textView_question  = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        // Buttons
        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);

        leftButton.setText("Wake Up");
        rightButton.setText("Explore");

        // set clickListeners
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
    }// end of onCreate() method

    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            // send them to the Wake up Activity
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.button_right)
        {
            // send them to Explore Activity
            Intent i = new Intent(this, ExploreActivity.class);
            startActivity(i);
        }
    }// end of onClick() method
}// end of MainActivity class
