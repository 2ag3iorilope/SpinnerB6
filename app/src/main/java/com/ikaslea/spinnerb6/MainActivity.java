package com.ikaslea.spinnerb6;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView ListviewHizkuntzak;
    TextView textViewHizkuntzaTestua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListviewHizkuntzak = findViewById(R.id.ListView1);
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
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Hizkuntzak);
        ListviewHizkuntzak.setAdapter(adapter);


        ListviewHizkuntzak.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {

                textViewHizkuntzaTestua.setText(Esaldiak[position]);
            }
        });

    }
}