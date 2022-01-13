package com.kulesh.shareit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void input(View view) {
//        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
//        SharedPreferences preferences=getPreferences(MODE_PRIVATE);
        SharedPreferences preferences=getSharedPreferences("ABC",MODE_PRIVATE);
        SharedPreferences.Editor e=preferences.edit();
        e.putString("key","Kulesh and Jenny");
        e.apply();
    }

    public void output(View view) {
//        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
//        SharedPreferences preferences=getPreferences(MODE_PRIVATE);
        SharedPreferences preferences=getSharedPreferences("ABC",MODE_PRIVATE);
        String name=preferences.getString("key","Not Found!");
        TextView tv=findViewById(R.id.txt);
        tv.setText(name);
    }
}
//1.getPreferences() : used from within your Activity, to access activity-specific preferences
//2.getSharedPreferences() : used from within your Activity (or other application Context),
//to access application-level preferences
//3.getDefaultSharedPreferences() : used on the PreferenceManager,
//to get the shared preferences that work in concert with
//Android’s overall preference framework