package com.example.android.repertoirebeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TuneActivity extends AppCompatActivity {
    String versions[] = {"Version 1", "Version 2", "Version 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tune);

        final Spinner spinner = (Spinner) findViewById(R.id.version_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, versions);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        //Sets the position of the selected item to a variable, then assigns the current drink and displays the appropriate toppings
                        int position = spinner.getSelectedItemPosition();
                        Log.v("Current Version", versions[position]);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {

                    }
                }
        );
    }

    public void fullscreen (View v){
        Intent intent = new Intent (this, ImageActivity.class);
        startActivity(intent);
    }
}
