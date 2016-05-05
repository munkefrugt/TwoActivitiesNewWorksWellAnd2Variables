package com.example.twoactivitiesnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.i("TAG", "onCreate: ");



        Intent intent = getIntent();

        // get the data:
        // example of to values.
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Extra String");
        Log.i("TAG",value);
            String value2 = extras.getString("Extra String2");
            Log.i("TAG",value);

            TextView view = (TextView) findViewById(R.id.edit_message);
            view.setText(value);

            TextView view2 = (TextView) findViewById(R.id.edit_message2);
            view2.setText(value2);

        }


        /*String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);*/
    }

}
