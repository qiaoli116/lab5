package com.holmesglen.lab05multiscreenapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.holmesglen.lab05multiscreenapp.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FloatingActionButton btnAdd = findViewById(R.id.fab_home_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1) create Intent
                Intent intent = new Intent(HomeActivity.this, AddActivity.class);

                // 2) inject data to send
                // 3) start Activity
                HomeActivity.this.startActivity(intent);
            }
        });
        // start code

asfas
        // more coding for V2.0
    }
}
