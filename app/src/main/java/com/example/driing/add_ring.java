package com.example.driing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class add_ring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RadioGroup choixSonnerie;
        Button btnEnregistrer;
        EditText timeSonnerie;
        TimePickerDialog timePickerDialog;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ring);

        choixSonnerie = findViewById(R.id.choixSonnerie);
        btnEnregistrer = findViewById(R.id.btnEnregistrer);

        timeSonnerie = findViewById(R.id.editTextTime);
        timeSonnerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TimePickerDialog timePickerDialog = new TimePickerDialog(this,10,20,true);

            }
        });

        btnEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedID = choixSonnerie.getCheckedRadioButtonId();
                if(checkedID == -1){
                    Message.message(getApplicationContext(), "Vous n'avez pas sélectionné de sonnerie");
                }
                else{
                    //Message.message(getApplicationContext(), "test");
                    //Sonnerie s = new Sonnerie(checkedID, );
                }
            }
        });

    }

}