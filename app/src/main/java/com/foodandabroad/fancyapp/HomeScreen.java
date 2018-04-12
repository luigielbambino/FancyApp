package com.foodandabroad.fancyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button swimming_suit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        swimming_suit_btn= (Button)findViewById(R.id.swimming_suit_btn);

        swimming_suit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(HomeScreen.this, DetailScreen.class);
                startActivity(Intent);
            }
        });

    }
}