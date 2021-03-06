package com.example.aula_7.bottonnavigation;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView  bnv = (BottomNavigationView) findViewById(R.id.bnv_1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId()){

                   case R.id.item_1:
                       Toast.makeText(MainActivity.this,"Item 1", Toast.LENGTH_SHORT).show();
                       UnoFragment pantalla1 = new UnoFragment();
                       getSupportFragmentManager()
                               .beginTransaction()
                               .replace(R.id.frl_1, pantalla1)
                               .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                               .addToBackStack(null)
                               .commit();                       break;

                   case R.id.item_2:
                       Toast.makeText(MainActivity.this,"Item 2", Toast.LENGTH_SHORT).show();

                       DosFragment pantalla2 = new DosFragment();
                       getSupportFragmentManager()
                               .beginTransaction()
                               .replace(R.id.frl_1, pantalla2)
                               .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                               .addToBackStack(null)
                               .commit();
                       break;

                   case R.id.item_3:
                       Toast.makeText(MainActivity.this,"Item 3", Toast.LENGTH_SHORT).show();
                       break;

               }




                return false;
            }
        });
    }

}
