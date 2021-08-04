package com.app.pocketplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private ImageButton buttonPlan, buttonPaint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlan = findViewById(R.id.planButton);
        buttonPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDraw();
            }
        });


        buttonPaint = findViewById(R.id.paletteButton);
        buttonPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlan();
            }
        });
    }

    public void openDraw(){
        Intent intent = new Intent(this, PlanActivity.class);
        startActivity(intent);

    }
    public void openPlan(){
        Intent intent = new Intent(this, DrawingView.class);
        startActivity(intent);
    }

}
