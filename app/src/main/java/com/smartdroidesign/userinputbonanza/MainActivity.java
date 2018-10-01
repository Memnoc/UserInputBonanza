package com.smartdroidesign.userinputbonanza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private TextView editTextField;
    private RadioButton radioButtonField;
    private CheckBox checkboxField;
    private Button switchButtonField;
    private ToggleButton toggleButtonField;
    private Spinner spinnerField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Registering buttons
        Button editTextBtn = findViewById(R.id.plainTextBtn);
        Button radioButton = findViewById(R.id.radioBtn);
        Button checkBoxButton = findViewById(R.id.checkBoxBtn);
        Button mSwitchButton = findViewById(R.id.switchFieldToggle);
        Button toggleButton = findViewById(R.id.toggleBtn);
        Button spinnerButton = findViewById(R.id.spinnerBtn);

        // Registering view
        editTextField = findViewById(R.id.plainTextField);
        radioButtonField = findViewById(R.id.radioButtonField);
        checkboxField = findViewById(R.id.checkBoxField);
        switchButtonField = findViewById(R.id.switchField);
        toggleButtonField = findViewById(R.id.toggleField);
        spinnerField = findViewById(R.id.spinnerField);


        // On Clicks
        editTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextField.getText().toString();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = radioButtonField.getText().toString();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

        checkBoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkboxField.isChecked()) {
                    Toast.makeText(MainActivity.this, "The Checkbox is checked!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "The Checkbox is NOT checked!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mSwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = switchButtonField.getText().toString();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButtonField.isChecked()) {
                    Toast.makeText(MainActivity.this, "The toggle is ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "The toggle is OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerPresenter();
            }
        });
    }

    private void spinnerPresenter() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerField.setAdapter(adapter);
        Toast.makeText(MainActivity.this, "Spinner options is selected!!", Toast.LENGTH_SHORT).show();
    }
}