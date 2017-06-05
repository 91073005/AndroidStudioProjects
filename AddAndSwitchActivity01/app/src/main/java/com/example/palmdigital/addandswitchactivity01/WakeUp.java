package com.example.palmdigital.addandswitchactivity01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WakeUp extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        Button buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(this);
    }

    public void onClick (View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
