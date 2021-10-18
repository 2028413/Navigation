package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation.databinding.ActivityMainBinding;

public class Navigation extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.Article.setOnClickListener(v -> {
            Intent i =new Intent(Navigation.this, Article.class);
            startActivity(i);
        });
        binding.Contact.setOnClickListener(v -> {
            Intent i =new Intent(Navigation.this, ContactActivity.class);
            startActivity(i);
        });
        setTitle("Accueil");
    }

}
