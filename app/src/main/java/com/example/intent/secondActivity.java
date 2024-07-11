package com.example.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intent.R;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView passwordTextView = findViewById(R.id.passwordTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String email = extras.getString("email");
            String password = extras.getString("password");

            emailTextView.setText("Email: " + email);
            passwordTextView.setText("Password: " + password);
        }
    }
}
