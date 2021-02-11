package com.example.poundstokilogramconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter (View v){

        EditText etpounds = findViewById(R.id.poundId);
        EditText etkilo = findViewById(R.id.KiloId);

        String poundsInSting = etpounds.getText().toString();

        double pounds = Double.parseDouble(poundsInSting);
        Double kilo = pounds* 0.453592;
        String kiloInString = String.valueOf(kilo);
        etkilo.setText(kiloInString);
    }
}
