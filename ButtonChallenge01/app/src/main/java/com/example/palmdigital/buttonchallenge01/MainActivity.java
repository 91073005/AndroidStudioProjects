package com.example.palmdigital.buttonchallenge01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button)findViewById(R.id.button1);
        Button buttonObject02 = (Button)findViewById(R.id.button2);
        Button buttonObject3 = (Button)findViewById(R.id.button3);

        buttonObject01.setText("Contacts");
        buttonObject02.setText("Email");
        buttonObject3.setText("Messages");

        buttonObject01.setBackgroundColor(0xff00ff00);
        buttonObject02.setBackgroundColor(0xff00ffff);
        buttonObject3.setBackgroundColor(0xffff0000);

        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
        buttonObject3.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.button1)
        {
            Toast.makeText(this, "Someone contacted you!", Toast.LENGTH_SHORT).show();
            Log.i("info", "Someone contacted you!");
        }
        if(view.getId() == R.id.button2)
        {
            Toast.makeText(this, "Someone sent an email!", Toast.LENGTH_SHORT).show();
            Log.i("info", "Someone sent an email!");
        }
        if(view.getId() == R.id.button3)
        {
            Toast.makeText(this, "A new message has appeared!", Toast.LENGTH_SHORT).show();
            Log.i("info", "A new message has appeared!");
        }
    }
}
