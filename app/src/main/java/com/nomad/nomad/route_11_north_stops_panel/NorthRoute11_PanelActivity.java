package com.nomad.nomad.route_11_north_stops_panel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.nomad.nomad.R;
import com.nomad.nomad.route_11_north.Col_H_Activity;
import com.nomad.nomad.route_11_north.Del_Activity;
import com.nomad.nomad.route_11_north.F_38_Activity;
import com.nomad.nomad.route_11_north.F_Lake_Activity;
import com.nomad.nomad.route_11_north.G_29_Activity;
import com.nomad.nomad.route_11_north.I_35_Activity;
import com.nomad.nomad.route_11_north.Lowry_Activity;
import com.nomad.nomad.route_11_north.N_3_Activity;
import com.nomad.nomad.route_11_north.N_46_Activity;
import com.nomad.nomad.route_11_north.N_7_Activity;
import com.nomad.nomad.route_11_north.N_G_Activity;
import com.nomad.nomad.route_11_north.T_F_Activity;

import java.util.ArrayList;

public class NorthRoute11_PanelActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_route11__panel);

        arrayList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.north_direction_route_11);

        /**
         *
         * [{
         * 	"Text": "Nicollet Ave and 46th St",
         * 	"Value": "46NI"
         * }, {
         * 	"Text": "I-35W  and 46th St Station",
         * 	"Value": "I346"
         * }, {
         * 	"Text": "4th Ave  and 38th St",
         * 	"Value": "384A"
         * }, {
         * 	"Text": "4th Ave  and Lake St",
         * 	"Value": "4ALA"
         * }, {
         * 	"Text": "3rd Ave  and Franklin Ave",
         * 	"Value": "3AFR"
         * }, {
         * 	"Text": "Nicollet Ave and Grant St",
         * 	"Value": "GRNI"
         * }, {
         * 	"Text": "Nicollet Mall and 7th St ",
         * 	"Value": "7SNI"
         * }, {
         * 	"Text": "Nicollet Mall and 3rd St ",
         * 	"Value": "3SNI"
         * }, {
         * 	"Text": "DeLaSalle High School",
         * 	"Value": "DELA"
         * }, {
         * 	"Text": "Lowry Ave NE and 2nd St NE",
         * 	"Value": "LW2S"
         * }, {
         * 	"Text": "Grand St  and 29th Ave ",
         * 	"Value": "29GR"
         * }, {
         * 	"Text": "Columbia Heights Transit Center",
         * 	"Value": "41CE"
         * }]
         *
         */

        arrayList.add("Nicollet Ave and 46th St");
        arrayList.add("I-35W  and 46th St Station");
        arrayList.add("4th Ave  and 38th St");
        arrayList.add("4th Ave  and Lake St");
        arrayList.add("3rd Ave  and Franklin Ave");
        arrayList.add("Nicollet Ave and Grant St");
        arrayList.add("Nicollet Mall and 7th St ");
        arrayList.add("Nicollet Mall and 3rd St ");
        arrayList.add("DeLaSalle High School");
        arrayList.add("Lowry Ave NE and 2nd St NE");
        arrayList.add("Grand St  and 29th Ave ");
        arrayList.add("Columbia Heights Transit Center");


        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView)view.findViewById(android.R.id.text1);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 22);

                return view;
            }
        };

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, N_46_Activity.class));
                        break;

                    case 1:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, I_35_Activity.class));
                        break;

                    case 2:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, F_38_Activity.class));
                        break;

                    case 3:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, F_Lake_Activity.class));
                        break;

                    case 4:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, T_F_Activity.class));
                        break;

                    case 5:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, N_G_Activity.class));
                        break;

                    case 6:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, N_7_Activity.class));
                        break;

                    case 7:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, N_3_Activity.class));
                        break;

                    case 8:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, Del_Activity.class));
                        break;

                    case 9:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, Lowry_Activity.class));
                        break;

                    case 10:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, G_29_Activity.class));
                        break;


                    case 11:
                        startActivity(new Intent(NorthRoute11_PanelActivity.this, Col_H_Activity.class));
                        break;






                }
            }
        });

    }
}
