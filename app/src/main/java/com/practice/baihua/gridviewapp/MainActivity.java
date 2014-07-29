package com.practice.baihua.gridviewapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends Activity {

    GridView myGrid;
    String[] countries = {"China", "France", "Germany", "Italy", "Russia", "Spain", "US"};
    int[] flags = {R.drawable.china, R.drawable.france, R.drawable.germany, R.drawable.italy, R.drawable.russia,
            R.drawable.spain, R.drawable.us};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGrid = (GridView) findViewById(R.id.my_grid);

        MyGridAdapter mAdapter = new MyGridAdapter(this, countries, flags);
        myGrid.setAdapter(mAdapter);

        myGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), countries[position] + " was clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
