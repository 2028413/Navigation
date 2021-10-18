package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.navigation.databinding.ArticleBinding;
import com.example.navigation.databinding.ContactBinding;

public class ContactActivity  extends AppCompatActivity {
    private ContactBinding binding;
    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.Accueil.setOnClickListener(v -> {
            Intent i =new Intent(ContactActivity.this, Navigation.class);
            startActivity(i);
        });
        setTitle("Contact");
    }
}
