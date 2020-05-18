package com.example.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText campoFrase1;
    EditText campoFrase2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoFrase1 = (EditText) findViewById(R.id.txtFrase1);
        campoFrase2 = (EditText) findViewById(R.id.txtFrase2);
    }

    public void evento(View view) {
        Intent miIntent = new Intent(MainActivity.this, FraseActivity.class);
        String frase1 = campoFrase1.getText().toString();
        String frase2 = campoFrase2.getText().toString();
        Bundle miBundle = new Bundle();
        miBundle.putString("frase1",campoFrase1.getText().toString());
        miBundle.putString("frase2",campoFrase2.getText().toString());
        miIntent.putExtras(miBundle);
        startActivity(miIntent);
    }
}
