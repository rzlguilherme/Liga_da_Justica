package com.example.liga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Observar(View view){
        RadioButton Btm = findViewById(R.id.RdbBtm);
        RadioButton Spr = findViewById(R.id.RdbSpm);
        RadioButton MlrMrv = findViewById(R.id.RdbMlrMrv);
        RadioButton LV = findViewById(R.id.RdbLntnVrd);
        Intent intent;

        if (Btm.isChecked())
            intent = new Intent(this, Batman.class);
        else if (Spr.isChecked())
            intent = new Intent(this, Superman.class);
        else if (MlrMrv.isChecked())
            intent = new Intent(this, MulherMaravilha.class);
        else if (LV.isChecked())
            intent = new Intent(this, LanternaVerde.class);
        else
            intent = new Intent(this, Flash.class);
        startActivity(intent);
    }
}