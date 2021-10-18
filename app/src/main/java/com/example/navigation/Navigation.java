package com.example.navigation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation.databinding.ActivityMainBinding;

public class Navigation extends AppCompatActivity {
    private ActivityMainBinding binding;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        NumberPicker np = findViewById(R.id.number);
        np.setMinValue(0);
        np.setMaxValue(10);
        np.setWrapSelectorWheel(true);
        if(getIntent().getStringExtra("nom") == null){
            binding.txtaffichage.setText("Bonjour");
        }
        else {
            binding.txtaffichage.setText("Bonjour " + getIntent().getStringExtra("nom"));
        }

        binding.Article.setOnClickListener(v -> {
            Intent i =new Intent(Navigation.this, Article.class);
            int x = np.getValue();
            i.putExtra("nombre", x);
            startActivity(i);
        });
        binding.Contact.setOnClickListener(v -> {
            Intent i =new Intent(Navigation.this, ContactActivity.class);
            startActivity(i);
        });

        setTitle("Accueil");
    }

}
