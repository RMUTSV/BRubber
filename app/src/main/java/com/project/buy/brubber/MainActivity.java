package com.project.buy.brubber;

import android.app.Activity;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.project.buy.brubber.fragment.MainFragment;

public class MainActivity extends Activity {

    private Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matchView();
    }

    private void matchView(){
        btnstart = (Button) findViewById(R.id.btnstart);
    }

    public void Btnstart (View view){

        Intent intent = new Intent(getApplicationContext(), NetworkInfo.DetailedState.class);
        startActivity(intent);

    }



}   // Main Class
