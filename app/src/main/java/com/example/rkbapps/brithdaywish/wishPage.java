package com.example.rkbapps.brithdaywish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class wishPage extends AppCompatActivity {
    TextView recived;
    FloatingActionButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_page);
        getSupportActionBar().hide();
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        @Override
//        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case android.R.id.home:
//                    this.finish();
//                    return true;
//            }
//            return super.onOptionsItemSelected(item);
//        }
        recived = findViewById(R.id.nameView);
        back=findViewById(R.id.floatingActionButton);
        Intent intent = getIntent();
        String Str = intent.getStringExtra("Name");
        recived.setText(Str);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(wishPage.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}