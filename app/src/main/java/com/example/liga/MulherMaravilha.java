package com.example.liga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MulherMaravilha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulher_maravilha);
    }

    public void SaibaMaisM(View view){
        Uri uri = Uri.parse("https://justiceiros.fandom.com/pt-br/wiki/Mulher_Maravilha");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}