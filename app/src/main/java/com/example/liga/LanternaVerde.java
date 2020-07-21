package com.example.liga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LanternaVerde extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanterna_verde);
    }

    public void SaibaMaisL(View view){
        Uri uri = Uri.parse("https://justiceiros.fandom.com/pt-br/wiki/Hal_Jordan");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}