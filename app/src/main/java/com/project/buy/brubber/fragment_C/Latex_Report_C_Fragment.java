package com.project.buy.brubber.fragment_C;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.project.buy.brubber.R;

/**
 * Created by sasiporn on 12/12/2017 AD.
 */

public class Latex_Report_C_Fragment extends Activity {

    private Toolbar toolbar;

    // ทำให้รู้จักกับ xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_c_report_latex);

        toolbar = (Toolbar) findViewById(R.id.toolbarCReportLat);
        setSupportActionBar(toolbar);
        toolbar.setTitle("รายงานการขายน้ำยาง");
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
