package com.example.palmdigital.textview_output_01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create reference for our UI Imageviews
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        // setting the references to be click listeners
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
       imageViewNum8.setOnClickListener(this);

    }// end of onCreate()

    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView)
        {
            //Toast.makeText(MainActivity.this, "You clicked 1", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
        else if(view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        else if(view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        else if(view.getId() == R.id.imageView4)
        {
           textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if(view.getId() == R.id.imageView5)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if(view.getId() == R.id.imageView6)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView8)
        {
            int sum = num1 + num2;
            textViewDisplayBottom.setText("" + sum);
        }
    }
}
