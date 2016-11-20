package com.example.admin.hw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public abstract class TopMenu extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.activity_a:
                intent = new Intent(getApplicationContext(), ActivityA.class);
                startActivity(intent);
                return true;
            case R.id.activity_b:
                intent = new Intent(getApplicationContext(), ActivityB.class);
                startActivity(intent);
                return true;
            case R.id.activity_c:
                intent = new Intent(getApplicationContext(), ActivityC.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
