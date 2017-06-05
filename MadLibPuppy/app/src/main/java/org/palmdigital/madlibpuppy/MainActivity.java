package org.palmdigital.madlibpuppy;

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
        // get all the references
        EditText et_color01 = (EditText) findViewById(R.id.edit_text_color01);
        EditText et_body_part01 = (EditText) findViewById(R.id.edit_text_body01);
        EditText et_noun01 = (EditText)findViewById(R.id.edit_text_noun01);
        EditText et_verb01 = (EditText) findViewById(R.id.edit_text_verb01);
        EditText et_adjective01 = (EditText) findViewById(R.id.edit_text_adjective01);
        EditText et_adjective02 = (EditText) findViewById(R.id.edit_text_adjective02);
        EditText et_verb02 = (EditText) findViewById(R.id.edit_text_verb02);
        EditText et_noun02 = (EditText) findViewById(R.id.edit_text_noun02);
        EditText et_noun03 = (EditText) findViewById(R.id.edit_text_noun03);

        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        // strings for the story
        String str_Color01 = et_color01.getText().toString();
        String str_BodyPart01 = et_body_part01.getText().toString();
        String str_Noun01 = et_noun01.getText().toString();
        String str_Verb01 = et_verb01.getText().toString();
        String str_Adjective01 = et_adjective01.getText().toString();
        String str_Adjective02 = et_adjective02.getText().toString();
        String str_Verb02 = et_verb02.getText().toString();
        String str_Noun02 = et_noun02.getText().toString();
        String str_Noun03 = et_noun03.getText().toString();
        String story = "Today I saw him again. When he looks at me with those " + str_Color01;
        story += " eyes, it makes my " + str_BodyPart01;
        story += " go pitterpat, and I feel as if I have " + str_Noun01;
        story += " in my stomach. When he scrunches his nose, I want to " + str_Verb01;
        story += " him softly. He is so " + str_Adjective01 + " and " + str_Adjective02;
        story += ". Tomorrow he will be mine. For now he " + str_Verb02 + " in the store " + str_Noun02 + " looking at me. ";
        story += str_Noun03 + " love is hard to resist!";


        tv_story.setText(story);
    }
}