package com.ming.appvsesionutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ming.appversionutils.AppVersionUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView banbenhao = findViewById(R.id.banbenhao);
        TextView banbenmingcheng = findViewById(R.id.banbenmingcheng);
        TextView appmingcheng = findViewById(R.id.appmingcheng);
        banbenhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), String.valueOf(AppVersionUtils.getVersionCode(getBaseContext())),Toast.LENGTH_LONG).show();
            }
        });
        banbenmingcheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), String.valueOf(AppVersionUtils.getVerName(getBaseContext())),Toast.LENGTH_LONG).show();
            }
        });
        appmingcheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), String.valueOf(AppVersionUtils.getAppName(getBaseContext())),Toast.LENGTH_LONG).show();
            }
        });
    }
}
