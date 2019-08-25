package com.nomad.nomad.route_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nomad.nomad.R;
import com.nomad.nomad.route_11_north_stops_panel.NorthRoute11_PanelActivity;
import com.nomad.nomad.route_11_south_stops_panel.SouthRoute11_PanelActivity;

public class NorthSouthActivity extends AppCompatActivity {

    private Button northbtn,southbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_south);

        northbtn = (Button)findViewById(R.id.route_11_north_direciton_btn);
        southbtn = (Button)findViewById(R.id.route_11_south_direction_btn);

        northbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent north_intent = new Intent(NorthSouthActivity.this,
                        NorthRoute11_PanelActivity.class);
                startActivity(north_intent);
            }
        });

        southbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent north_intent = new Intent(NorthSouthActivity.this,
                        SouthRoute11_PanelActivity.class);
                startActivity(north_intent);
            }
        });



    }
}
