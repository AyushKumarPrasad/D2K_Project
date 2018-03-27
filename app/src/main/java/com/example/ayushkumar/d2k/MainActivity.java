package com.example.ayushkumar.d2k;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference of widgets from XML layout
        ListView lv = (ListView) findViewById(R.id.lv);
         //     final TextView tv = (TextView) findViewById(R.id.tv);

        // Initializing a new String Array
        String[] fruits = new String[]
                {
                "Ayush Kumar",
                "Basketball",
                "Football",
                "Cricket",
                "Badmintion",
                "Table Tennis"
        };

        // Create a List from String Array elements
        List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        // Create a ArrayAdapter from List
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, fruits_list);

        // Populate ListView with items from ArrayAdapter
        lv.setAdapter(arrayAdapter);

        // Set an item click listener for ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                String selectedItem = (String) parent.getItemAtPosition(position);
                intent.putExtra("item",parent.getItemAtPosition(position).toString());
                startActivity(intent);

           //     String input = "GeeksforGeeks";

                // getBytes() method to convert string
                // into bytes[].

            }
        });
    }
}
