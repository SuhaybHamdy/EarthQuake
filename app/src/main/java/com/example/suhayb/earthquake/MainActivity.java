package com.example.suhayb.earthquake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> earthquekes = new ListAdapter<>();
        earthquekes.add("San Fransescpo");
        earthquekes.add("Mosco");
        earthquekes.add("lANDAN");
        earthquekes.add("TOKYO");
        earthquekes.add("BARIC");
        ListView earthquekesListView=(ListView) findViewById(R.id.List);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,earthquekes);
        earthquekesListView.setAdapter(adapter);
    }
}
