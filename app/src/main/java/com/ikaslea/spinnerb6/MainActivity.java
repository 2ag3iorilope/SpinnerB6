package com.ikaslea.spinnerb6;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerHizkuntzak;
    TextView textViewHizkuntzaTestua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerHizkuntzak = findViewById(R.id.spinner);
        textViewHizkuntzaTestua = findViewById(R.id.textView);

        String[] Hizkuntzak = {
                getString(R.string.castellano),
                getString(R.string.euskera),
                getString(R.string.ingles),
                getString(R.string.aleman),
                getString(R.string.noruego)
        };

        String[] Esaldiak = {
                getString(R.string.frase_castellano),
                getString(R.string.frase_euskera),
                getString(R.string.frase_ingles),
                getString(R.string.frase_aleman),
                getString(R.string.frase_noruego)
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Hizkuntzak);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHizkuntzak.setAdapter(adapter);

        spinnerHizkuntzak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {

                textViewHizkuntzaTestua.setText(Esaldiak[position]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}