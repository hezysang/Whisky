package com.example.whisky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    CardView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUp = findViewById(R.id.cardView);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this,"Sign up successful.",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignUp.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
