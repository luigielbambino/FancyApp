package com.foodandabroad.fancyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStart extends AppCompatActivity {

    Button btn_get_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_start);

        btn_get_start= (Button)findViewById(R.id.btn_get_start);

        btn_get_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(GetStart.this, HomeScreen.class);
                startActivity(Intent);
            }
        });
    }
}