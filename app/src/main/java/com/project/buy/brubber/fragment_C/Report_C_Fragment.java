package com.project.buy.brubber.fragment_C;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import com.project.buy.brubber.R;

/**
 * Created by sasiporn on 12/12/2017 AD.
 */

public class Report_C_Fragment extends Activity {

    private Toolbar toolbar;

    // ทำให้รู้จักกับ xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_c_report);

        toolbar = (Toolbar) findViewById(R.id.toolbarCReport);
        setSupportActionBar(toolbar);
        toolbar.setTitle("รายงานการขาย");

    }

    private void setSupportActionBar(Toolbar toolbar) {
    }




}
