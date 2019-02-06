package com.example.listviewplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: List View");

        String[] names =
                {"Popuri", "Blue", "Chen", "Cam", "Alex", "Carl", "Neil", "Rod", "Soseki", "Allen", "Sanjay", "Amir",
                        "Felicity", "Iroha", "Tina", "Michelle", "Yuri"};

        //ListAdapter newAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        ListAdapter newAdapter = new CustomAdapter(this, names);

        // list view
        android.widget.ListView listView = (android.widget.ListView) findViewById(R.id.list_view);

        listView.setAdapter(newAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
            }
        });
    }

}
