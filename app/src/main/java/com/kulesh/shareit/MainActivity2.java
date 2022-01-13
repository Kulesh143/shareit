package com.kulesh.shareit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void input(View view) {
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("id","Kulesh");
        editor.putString("grade","98");
        editor.apply();
//        editor.commit();
//        Apply                Commit
//        asynchronus          synchronous
//        doesnt block         blocks UI thread
//        UI thread
//        updates instantly    doesnt update instantly
//        no return type       returns boolean saying updated


    }

    public void output(View view) {
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        Map<String,?> map=preferences.getAll();
        for(Map.Entry<String,?>e:map.entrySet()){
            TextView tv=findViewById(R.id.txt);
            tv.setText("key= "+e.getKey()+" value= "+e.getValue());
            System.out.println("key= "+e.getKey()+" value= "+e.getValue());
            Log.i("eeee","key= "+e.getKey()+" value= "+e.getValue());
        }
    }
}