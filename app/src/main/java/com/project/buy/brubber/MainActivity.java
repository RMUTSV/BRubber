package com.project.buy.brubber;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.project.buy.brubber.fragment.MainFragment;
import com.project.buy.brubber.fragment_C.Main_C_Fragment;


public class MainActivity extends AppCompatActivity{

// กดเข้าสู่ร้านยาง
    public void onClickNext(View view){
        Button btn_start = (Button) findViewById(R.id.btnstart);
        Intent intent = new Intent(MainActivity.this, MainFragment.class);
        startActivity(intent);
    }

// กำหนดให้รู้จักกับ xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // กด กลับเพื่อออกจากแอพ
    public void onBackPressed() {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("ออกจากแอพพลิเคชั่น ?");
        dialog.setIcon(R.drawable.ic_action_alert);
        dialog.setCancelable(true);
        dialog.setMessage("กรุณายืนยันเพื่อออกจากระบบ");
        dialog.setPositiveButton("ยกเลิก", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });

        dialog.setNegativeButton("ตกลง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                finish();

            }
        });

        dialog.show();

    }



    
}   // Main Class

