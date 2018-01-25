package com.project.buy.brubber.fragment_O;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.project.buy.brubber.R;

/**
 * Created by sasiporn on 12/12/2017 AD.
 */

public class Add_Customer_O_Fragment extends Activity {

    private Toolbar toolbar;

    // ทำให้รู้จักกับ xml
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_o_customer_add);

        toolbar = (Toolbar) findViewById(R.id.toolbarOCustomerAdd);
        setSupportActionBar(toolbar);
        toolbar.setTitle("เพิ่มลูกค้า");
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
