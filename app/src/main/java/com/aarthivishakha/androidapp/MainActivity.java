package com.aarthivishakha.androidapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final GreetingService greetings = new GreetingService();

    @Override protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.nameInput);
        Button button = findViewById(R.id.greetButton);
        TextView result = findViewById(R.id.resultText);
        button.setOnClickListener(view -> result.setText(greetings.greet(name.getText().toString())));
    }
}
