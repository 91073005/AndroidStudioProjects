package com.example.palmdigital.simplecalculator_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    ImageView numberZero01;
    ImageView numberOne01;
    ImageView numberTwo01;
    ImageView numberThree01;
    ImageView numberFour01;
    ImageView numberFive01;
    ImageView numberSix01;
    ImageView numberSeven01;
    ImageView numberEight01;
    ImageView numberNine01;

    ImageView numberZero02;
    ImageView numberOne02;
    ImageView numberTwo02;
    ImageView numberThree02;
    ImageView numberFour02;
    ImageView numberFive02;
    ImageView numberSix02;
    ImageView numberSeven02;
    ImageView numberEight02;
    ImageView numberNine02;

    ImageView plusSign;
    ImageView minusSign;
    ImageView equalSign;

    TextView textViewTop;
    TextView textViewMiddle;
    TextView textViewBottom;

    int num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTop = (TextView)findViewById(R.id.textViewTop);
        textViewMiddle = (TextView) findViewById(R.id.textViewMiddle);
        textViewBottom = (TextView) findViewById(R.id.textViewBottom);

        numberZero01 = (ImageView) findViewById(R.id.numberZero01);
        numberOne01 = (ImageView) findViewById(R.id.numberOne01);
        numberTwo01 = (ImageView) findViewById(R.id.numberTwo01);
        numberThree01 = (ImageView) findViewById(R.id.numberThree01);
        numberFour01 = (ImageView) findViewById(R.id.numberFour01);
        numberFive01 = (ImageView) findViewById(R.id.numberFive01);
        numberSix01 = (ImageView) findViewById(R.id.numberSix01);
        numberSeven01 = (ImageView) findViewById(R.id.numberSeven01);
        numberEight01 = (ImageView) findViewById(R.id.numberEight01);
        numberNine01 = (ImageView) findViewById(R.id.numberNine01);

        plusSign = (ImageView) findViewById(R.id.plusSign);
        minusSign = (ImageView) findViewById(R.id.minusSign);
        equalSign = (ImageView) findViewById(R.id.equalSign);

        numberZero02 = (ImageView) findViewById(R.id.numberZero02);
        numberOne02 = (ImageView) findViewById(R.id.numberOne02);
        numberTwo02 = (ImageView) findViewById(R.id.numberTwo02);
        numberThree02 = (ImageView) findViewById(R.id.numberThree02);
        numberFour02 = (ImageView) findViewById(R.id.numberFour02);
        numberFive02 = (ImageView) findViewById(R.id.numberFive02);
        numberSix02 = (ImageView) findViewById(R.id.numberSix02);
        numberSeven02 = (ImageView) findViewById(R.id.numberSeven02);
        numberEight02 = (ImageView) findViewById(R.id.numberEight02);
        numberNine02 = (ImageView) findViewById(R.id.numberNine02);


        numberZero01.setOnClickListener(this);
        numberOne01.setOnClickListener(this);
        numberTwo01.setOnClickListener(this);
        numberThree01.setOnClickListener(this);
        numberFour01.setOnClickListener(this);
        numberFive01.setOnClickListener(this);
        numberSix01.setOnClickListener(this);
        numberSeven01.setOnClickListener(this);
        numberEight01.setOnClickListener(this);
        numberNine01.setOnClickListener(this);

        plusSign.setOnClickListener(this);
        minusSign.setOnClickListener(this);
        equalSign.setOnClickListener(this);

        numberZero02.setOnClickListener(this);
        numberOne02.setOnClickListener(this);
        numberTwo02.setOnClickListener(this);
        numberThree02.setOnClickListener(this);
        numberFour02.setOnClickListener(this);
        numberFive02.setOnClickListener(this);
        numberSix02.setOnClickListener(this);
        numberSeven02.setOnClickListener(this);
        numberEight02.setOnClickListener(this);
        numberNine02.setOnClickListener(this);

    }
    public void onClick (View view)
    {
        if (view.getId() == R.id.numberZero01)
        {
            textViewTop.setText("0");
            num1 = 0;
        }
        if (view.getId() == R.id.numberOne01)
        {
            textViewTop.setText("1");
            num1 = 1;
        }
        if (view.getId() == R.id.numberTwo01)
        {
            textViewTop.setText("2");
            num1 = 2;
        }
        if (view.getId() == R.id.numberThree01)
        {
            textViewTop.setText("3");
            num1 = 3;
        }
        if (view.getId() == R.id.numberFour01)
        {
            textViewTop.setText("4");
            num1 = 4;
        }
        if (view.getId() == R.id.numberFive01)
        {
            textViewTop.setText("5");
            num1 = 5;
        }
        if (view.getId() == R.id.numberSix01)
        {
            textViewTop.setText("6");
            num1 = 6;
        }
        if (view.getId() == R.id.numberSeven01)
        {
            textViewTop.setText("7");
            num1 = 7;
        }
        if (view.getId() == R.id.numberEight01)
        {
            textViewTop.setText("8");
            num1 = 8;
        }
        if (view.getId() == R.id.numberNine01)
        {
            textViewTop.setText("9");
            num1 = 9;
        }
        if (view.getId() == R.id.minusSign)
        {
            minusSign.setBackgroundColor(0xffcccccc);
            sum = num1 - num2;
        }
        if (view.getId() == R.id.minusSign)
        {
            plusSign.setBackgroundColor(0xffffffff);
        }
        if (view.getId() == R.id.plusSign)
        {
            plusSign.setBackgroundColor(0xffcccccc);
            sum = num1 + num2;
        }
        if (view.getId() == R.id.plusSign)
        {
            minusSign.setBackgroundColor(0xffffffff);
        }
        if (view.getId() == R.id.numberZero02)
        {
            textViewMiddle.setText("0");
            num2 = 0;
        }
        if (view.getId() == R.id.numberOne02)
        {
            textViewMiddle.setText("1");
            num2 = 1;
        }
        if (view.getId() == R.id.numberTwo02)
        {
            textViewMiddle.setText("2");
            num2 = 2;
        }
        if (view.getId() == R.id.numberThree02)
        {
            textViewMiddle.setText("3");
            num2 = 3;
        }
        if (view.getId() == R.id.numberFour02)
        {
            textViewMiddle.setText("4");
            num2 = 4;
        }
        if (view.getId() == R.id.numberFive02)
        {
            textViewMiddle.setText("5");
            num2 = 5;
        }
        if (view.getId() == R.id.numberSix02)
        {
            textViewMiddle.setText("6");
            num2 = 6;
        }
        if (view.getId() == R.id.numberSeven02)
        {
            textViewMiddle.setText("7");
            num2 = 7;
        }
        if (view.getId() == R.id.numberEight02)
        {
            textViewMiddle.setText("8");
            num2 = 8;
        }
        if (view.getId() == R.id.numberNine02)
        {
            textViewMiddle.setText("9");
            num2 = 9;
        }
        if (view.getId() == R.id.equalSign)
        {
            textViewBottom.setText("" + sum);
        }
    }
}
