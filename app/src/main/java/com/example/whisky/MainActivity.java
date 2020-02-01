package com.example.whisky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CardView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.cardView);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"login successful.",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,BottomNav.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view) {

        Intent intent = new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);
    }
}
