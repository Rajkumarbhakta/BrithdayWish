package com.example.rkbapps.brithdaywish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class wishPage extends AppCompatActivity {
    TextView recived;
    ImageView back,bg;
    int image[]=new int[6];
    int index;
    Random random=new Random();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_page);
        recived = findViewById(R.id.name);
        back=findViewById(R.id.back);
        bg=findViewById(R.id.img);
        index= random.nextInt(6);
        image[0]=R.drawable.bg1;
        image[1]=R.drawable.bg2;
        image[2]=R.drawable.bg3;
        image[3]=R.drawable.bg4;
        image[4]=R.drawable.bg5;
        image[5]=R.drawable.bg6;
        bg.setImageResource(image[index]);
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