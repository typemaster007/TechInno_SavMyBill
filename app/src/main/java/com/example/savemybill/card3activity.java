package com.example.savemybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class card3activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card3activity);
    }

    public void openalexa(View view) {
        try{
            Intent openalexa = getPackageManager().getLaunchIntentForPackage("com.amazon.dee.app");
            startActivity(openalexa);
        }
        catch (ActivityNotFoundException | NullPointerException e) {
            Log.e("ex =",e.getMessage());
        }


    }
}
