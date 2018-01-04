package com.project.buy.brubber.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.project.buy.brubber.R;
import com.project.buy.brubber.fragment_C.Main_C_Fragment;

/**
 * Created by sasiporn on 12/12/2017 AD.
 */

public class MainFragment extends Activity {

// กดปุ่มไปสมัครร้านยาง
    public void onClickNext(View view){
        Button btn_Register = (Button) findViewById(R.id.btnRegister);
        Intent intent = new Intent(MainFragment.this, RegisterFragment.class);
        startActivity(intent);
    }

// ทำให้รู้จักกับ
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
    }


}   // Main Class
