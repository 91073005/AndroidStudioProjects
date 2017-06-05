package com.example.palmdigital.clickableimageview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageObject01 = (ImageView)findViewById(R.id.imageView1);
        imageObject01.setOnClickListener(this);

        ImageView imageObject02 = (ImageView)findViewById(R.id.imageView2);
        imageObject02.setOnClickListener(this);

        ImageView imageObject03 = (ImageView)findViewById(R.id.imageView3);
        imageObject03.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
            Toast.makeText(this, "There's a new contact!", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.imageView2)
        {
            Toast.makeText(this, "There's spam in your email!", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.imageView3)
        {
            Toast.makeText(this, "A new person has messaged you!", Toast.LENGTH_SHORT).show();
        }
    }
}
