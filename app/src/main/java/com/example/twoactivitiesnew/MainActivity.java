package com.example.twoactivitiesnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Jeg har lavet denne metode:
    //**********************************************************************************************
    //**********************************************************************************************
    public void goTonextActivity(View view)
    {
        //Den helt skrabede version.
        // husk at når der skabes en ny activity skal man vælge en empty activity da der skal laves en parent:
        // her er linket:
        // http://developer.android.com/training/basics/firstapp/starting-activity.html
        // Så skaber den selv alle de ander xml filer der er nødvendige.

        // this er context, som skal sendes med.
        //Intent intent = new Intent(this, Main2Activity.class);

        //send data med:
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        String valueName= "Hi there";
        // lad være med at ændre på "Extra String",

        intent.putExtra("Extra String",valueName);
        String valueName2="Hello again!";
        intent.putExtra("Extra String2",valueName2);

        // shtart the new activity
        startActivity(intent);


    }
    //**********************************************************************************************
    //**********************************************************************************************

}
