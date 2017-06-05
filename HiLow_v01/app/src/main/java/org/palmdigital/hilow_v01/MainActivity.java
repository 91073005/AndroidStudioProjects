package org.palmdigital.hilow_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void run (View view)
    {
        TextView tv_warning = (TextView) findViewById(R.id.textView_warning);
        TextView tv_new = (TextView) findViewById(R.id.textView_win_lose);

        EditText et_guess = (EditText) findViewById(R.id.editText_guess);

        //int answer = NumberUtils.getRandomInt(1, 100);
        Random answer = new Random();
        for (int i = 0; i < 8; i++)
        {
            int guess = input;
            if (guess == answer)
            {
                tv_new.setText("You Win!");
                System.exit(0);
            }
           // else if (guess > answer)
            {
                tv_warning.setText("Too High!");
            }
            //else
            {
                tv_warning.setText("Too Low!");
            }
        }
        tv_new.setText("You Lose!");
    }

    public void newGame (View view)
    {

    }
}
