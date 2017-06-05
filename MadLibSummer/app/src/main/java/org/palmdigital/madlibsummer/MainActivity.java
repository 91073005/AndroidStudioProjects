package org.palmdigital.madlibsummer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeStory (View view)
    {
        EditText et_name01 = (EditText) findViewById(R.id.edit_text_name01);
        EditText et_place01 = (EditText) findViewById(R.id.edit_text_place01);
        EditText et_adjective01 = (EditText) findViewById(R.id.edit_text_adjective01);
        EditText et_place02 = (EditText) findViewById(R.id.edit_text_place02);
        EditText et_pluralnoun01 = (EditText) findViewById(R.id.edit_text_plural_noun01);
        EditText et_adjective02 = (EditText) findViewById(R.id.edit_text_adjective02);
        EditText et_pluralnoun02 = (EditText) findViewById(R.id.edit_text_plural_noun02);
        EditText et_place03 = (EditText) findViewById(R.id.edit_text_place03);

        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        String str_Name01 = et_name01.getText().toString();
        String str_Place01 = et_place01.getText().toString();
        String str_Adjective01 = et_adjective01.getText().toString();
        String str_Place02 = et_place02.getText().toString();
        String str_PluralNoun01 = et_pluralnoun01.getText().toString();
        String str_Adjective02 = et_adjective02.getText().toString();
        String str_PluralNoun02 = et_pluralnoun02.getText().toString();
        String str_Place03 = et_place03.getText().toString();

        String story = "Last summer, my mom and dad took me and " + str_Name01;
        story += " on a trip to " + str_Place01;
        story += ". The weather there is very " + str_Adjective01;
        story += "! Northern " + str_Place02;
        story += " has many " + str_PluralNoun01;
        story += ", and they make " + str_Adjective02 + " " + str_PluralNoun02;
        story += " there. Many people also go to " + str_Place03;

        tv_story.setText(story);
    }
}
