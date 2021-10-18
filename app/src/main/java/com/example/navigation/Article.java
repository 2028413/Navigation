package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation.databinding.ArticleBinding;

public class Article extends AppCompatActivity {
private ArticleBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ArticleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.Contact.setOnClickListener(v -> {
            Intent i =new Intent(Article.this, ContactActivity.class);
            startActivity(i);
        });
        setTitle("Article");
    }
}
