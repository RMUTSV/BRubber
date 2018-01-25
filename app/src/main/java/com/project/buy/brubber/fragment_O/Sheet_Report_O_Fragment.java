package com.project.buy.brubber.fragment_O;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.project.buy.brubber.R;

/**
 * Created by sasiporn on 1/11/2018 AD.
 */

public class Sheet_Report_O_Fragment extends Activity {

    private Toolbar toolbar;

    // ทำให้รู้จักกับ xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_o_report_sheet);

        toolbar = (Toolbar) findViewById(R.id.toolbarOReportSheet);
        setSupportActionBar(toolbar);
        toolbar.setTitle("รายงานการรับซื้อยางแผ่น");
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
