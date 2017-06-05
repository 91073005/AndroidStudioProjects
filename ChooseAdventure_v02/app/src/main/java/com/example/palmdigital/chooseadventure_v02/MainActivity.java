package com.example.palmdigital.chooseadventure_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity //implements View.OnClickListener
{
    // fields
    String page = "main";
    String page2 = "wake up";
    String loadpage;
    Button leftButton;
    Button rightButton;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // references

        //TextViews
       TextView textView_story = (TextView)findViewById(R.id.textView_story);
        //TextView textView_question = (TextView)findViewById(R.id.textView_question);

        
       // textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        //Buttons
        //leftButton = (Button)findViewById(R.id.button_left);
        //rightButton = (Button)findViewById(R.id.button_right);
    }
 //   public void onClick (View view)
  //  {
//       if (page = "main")
//        {
//            if (page2 = "wake up")
//            {
//                loadpage();
//            }
//        }
 //   }
}
