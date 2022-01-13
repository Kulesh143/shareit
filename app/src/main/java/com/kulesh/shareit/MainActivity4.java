package com.kulesh.shareit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Map;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void inputs(View view) {
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor e=preferences.edit();
        e.putString("id","001");
        e.putString("name","Alex Rider");
        e.putString("grade","98");
        e.apply();

    }

    public void outputs(View view) {
        TextView tv=findViewById(R.id.txt);
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        Map<String ,?>map=preferences.getAll();
        for(Map.Entry<String,?>e:map.entrySet()){

            tv.setText("id= "+e.getKey()+" value= "+e.getValue());
            System.out.println("id= "+e.getKey()+" value= "+e.getValue());
            Log.i("Kandy","id= "+e.getKey()+" value= "+e.getValue());
        }
    }
}
//        editor.commit();
//        Apply                Commit
//        asynchronus          synchronous
//        doesnt block         blocks UI thread
//        UI thread
//        updates instantly    doesnt update instantly
//        no return type       returns boolean saying updated