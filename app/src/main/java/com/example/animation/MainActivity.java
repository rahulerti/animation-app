package com.example.animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textView = findViewById(R.id.textView);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.move);
        Animation alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale);

        Button button = findViewById(R.id.button7);
        Button button2 = findViewById(R.id.button5);
        Button button3 = findViewById(R.id.button8);
        Button button4 = findViewById(R.id.button6);

        button.setOnClickListener(v -> {
            textView.startAnimation(animation);
        });
        button2.setOnClickListener(v -> {
            textView.startAnimation(alpha);
        });
        button3.setOnClickListener(v -> {
            textView.startAnimation(rotation);
        });
        button4.setOnClickListener(v -> {
            textView.startAnimation(scale);
        });
        }

    }
