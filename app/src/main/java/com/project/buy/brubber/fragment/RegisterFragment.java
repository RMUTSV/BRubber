package com.project.buy.brubber.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.project.buy.brubber.MainActivity;
import com.project.buy.brubber.R;

/**
 * Created by sasiporn on 11/13/2017 AD.
 */

public class RegisterFragment extends Activity{

    private Toolbar toolbar;

// ทำให้รู้จักกับ xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register);

        toolbar = (Toolbar) findViewById(R.id.toolbarRegister);
        setSupportActionBar(toolbar);
        toolbar.setTitle("สมัครร้านยาง");


    }

    private void getSupportActionBar() {
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }





}   // Main Class