package com.project.buy.brubber.fragment_O;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.project.buy.brubber.R;

/**
 * Created by sasiporn on 12/12/2017 AD.
 */

public class Cube_Report_O_Fragment extends Activity {

    private Toolbar toolbar;

    // ทำให้รู้จักกับ xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_o_report_cube);

        toolbar = (Toolbar) findViewById(R.id.toolbarOReportCube);
        setSupportActionBar(toolbar);
        toolbar.setTitle("รายงานการรับซื้อยางก้อน");
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
