package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    public static final String preferenser = "Shared Preference";

    private Button button;
    private EditText eText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        eText = (EditText) findViewById(R.id.settingseditview);
        button = (Button) findViewById(R.id.prefButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SharedPreferences sharedP = getSharedPreferences(preferenser, MODE_PRIVATE);
                SharedPreferences.Editor sharedPEdit = sharedP.edit();
                sharedPEdit.putString(preferenser, eText.getText().toString()).apply();


            }

        });
    }


}
