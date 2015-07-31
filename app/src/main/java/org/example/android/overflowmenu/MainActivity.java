package org.example.android.overflowmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout main_view;

        main_view = (RelativeLayout) findViewById(R.id.main_view);

        switch (item.getItemId()){

            case R.id.menu_red:
                if(item.isChecked())
                    item.setChecked(false);
                else
                item.setChecked(true);

                main_view.setBackgroundColor(Color.parseColor("#F44336"));
                return true;

            case R.id.menu_green:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);

                main_view.setBackgroundColor(Color.parseColor("#4CAF50"));
                return true;

            case R.id.menu_yellow:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);

                main_view.setBackgroundColor(Color.parseColor("#FFEB3B"));
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
