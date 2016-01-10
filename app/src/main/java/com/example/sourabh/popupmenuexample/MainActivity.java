package com.example.sourabh.popupmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
    }

    public void clicked(View view)
    {
        //Creating the instance of PopupMenu
        PopupMenu pop = new PopupMenu(MainActivity.this,button);  //Constructor should have context of main activity and an anchor Here anchor is button

        //Inflating the Popup using xml file
        pop.getMenuInflater().inflate(R.menu.pop_menu,pop.getMenu());

        //registering popup with OnMenuItemClickListener
        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, "Boo I dont provide u any space for writing ur answer haha", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        pop.show(); //showing popup menu
    }
}
