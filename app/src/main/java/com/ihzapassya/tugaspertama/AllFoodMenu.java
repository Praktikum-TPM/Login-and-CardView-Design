package com.ihzapassya.tugaspertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllFoodMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
    }

    public void backBtn(View view) {
        startActivity(new Intent(AllFoodMenu.this, MainActivity.class));
        finish();
    }
}
