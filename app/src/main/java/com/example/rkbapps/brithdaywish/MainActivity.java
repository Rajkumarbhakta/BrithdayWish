package com.example.rkbapps.brithdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.btSubmit);
        name = findViewById(R.id.editName);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = name.getText().toString();
                if(Objects.equals(str, "")) {
                    Toast.makeText(MainActivity.this, "Enter a name", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, wishPage.class);
                    intent.putExtra("Name", str);
                    startActivity(intent);
                    finish();
                }
                name.setText("");
            }
        });
    }
}