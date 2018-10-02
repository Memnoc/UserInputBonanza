package com.smartdroidesign.userinputbonanza;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

//    private static final String TAG = TextActivity.class.getSimpleName();
    TextView textFromPreviousActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);


        textFromPreviousActivity = findViewById(R.id.textFromPreviousActivityView);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Resources resources = getResources();
        String declaration = resources.getString(R.string.welcome_to_the_text_activity);
//        Log.d(TAG, name);
        textFromPreviousActivity.setText(String.format("%s %s", declaration, name));
    }
}






//    Master Your Intents
//
//        Extra credit in an earlier stage involved creating an Activity with a lot of different user input controls (widgets).
//        Take that project (or create a new one if you need to) and practice opening a second Activity when each control is used.
//        Then practice attaching different types of data to the Intent and then retrieve it in the new Activity. Display the data you retrieve in a TextView in the new Activity.