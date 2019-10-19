package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void on_button_click(View view)
    {
        TextView ntv = this.findViewById(R.id.numberTextView);
        TextView itv = this.findViewById(R.id.InputBox);
        TextView ptv = this.findViewById(R.id.PointsTextView);
        Random ran = new Random();
        int ran_int = ran.nextInt(6);

        ntv.setText(Integer.toString(ran_int));

        String InputtedNum = itv.getText().toString();
        TextView ctv = this.findViewById(R.id.CongratTextView);

        if(ran_int == (Integer.valueOf(InputtedNum)))
        {
            ctv.setText("Congratulations!");
            String str_ptv = ptv.getText().toString();
            int num_ptv = Integer.valueOf(str_ptv);

            num_ptv += 1;
            str_ptv = Integer.toString(num_ptv);

            ptv.setText(str_ptv);
        }
        else
        {
            ctv.setText("");
        }

    }

}
