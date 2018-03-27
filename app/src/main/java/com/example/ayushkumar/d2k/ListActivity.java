package com.example.ayushkumar.d2k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity
{
    TextView textView, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        textView = (TextView) findViewById(R.id.textlist);
        text2 = (TextView) findViewById(R.id.textreverse);

     //   Intent intent = getIntent();

     //   String loginName = intent.getStringExtra("fruits");

        Intent intent = getIntent();
        String itemText = intent.getStringExtra("item");
        textView.setText(itemText);

/*        byte [] strAsByteArray = itemText.getBytes();
        byte [] result = new byte [strAsByteArray.length];
        for (int i = itemText.length(); i > 0; i--)
            result[i] = ((byte) itemText.charAt(i));
        System.out.println(new String(result));
        text2.setText(result.toString());  */

        String b = "";

        for (int i = 0; i < itemText.length(); i++ )
        {
            b = b + itemText.substring(itemText.length()-1-i, itemText.length()-i);
        }

        text2.setText(b);
    }
}
