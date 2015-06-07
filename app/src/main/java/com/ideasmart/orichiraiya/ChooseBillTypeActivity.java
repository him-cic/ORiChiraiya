package com.ideasmart.orichiraiya;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class ChooseBillTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_bill_type);

        getSupportActionBar().setBackgroundDrawable
                (new ColorDrawable(Color.parseColor("#ff6b6b")));


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(ChooseBillTypeActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void go(View v) {
        startActivity(new Intent(ChooseBillTypeActivity.this, ChooseColorActivity.class));

    }


}
