package com.example.android.repertoirebeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> tunes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tunes.add("Banbury Bill");
        tunes.add("Rusty Gully");
        tunes.add("Hamburger");
        tunes.add("Fourpence Halfpenny Farthing");
        tunes.add("Bear Dance");
        tunes.add("Hunt the Squirrel");

        final ArrayAdapter<String> tunesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tunes);
        ListView listView = (ListView) findViewById(R.id.activity_main);
        listView.setAdapter(tunesAdapter);

        int i = 0;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, TuneActivity.class);
                //based on item add info to intent
                startActivity(intent);
            }
        });
    }
}
