package com.project.buy.brubber.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.buy.brubber.R;

/**
 * Created by sasiporn on 12/12/2017 AD.
 */

public class EditpassFragment extends Activity {

    private Toolbar toolbar;

    // ทำให้รู้จักกับ xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_editpass);

        toolbar = (Toolbar) findViewById(R.id.toolbarEditpass);
        setSupportActionBar(toolbar);
        toolbar.setTitle("แก้ไขรหัสผ่าน");
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

}
