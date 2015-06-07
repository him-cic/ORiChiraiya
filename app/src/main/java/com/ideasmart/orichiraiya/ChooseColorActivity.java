package com.ideasmart.orichiraiya;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class ChooseColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_color);

        getSupportActionBar().setBackgroundDrawable
                (new ColorDrawable(Color.parseColor("#ff6b6b")));


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ColorAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(ChooseColorActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
