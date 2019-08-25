package com.nomad.nomad.route_2_west_stops_panel;

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
import android.widget.Toast;

import com.nomad.nomad.R;
import com.nomad.nomad.route_2_west.Eight_and_hennipen_Activity;
import com.nomad.nomad.route_2_west.Franklin_Ave_Chicago_Activity;
import com.nomad.nomad.route_2_west.Franklin_Ave_Nicollet_Activity;
import com.nomad.nomad.route_2_west.Franklin_Ave_Station_Activity;
import com.nomad.nomad.route_2_west.Heenipen_And_Franklin_Activity;
import com.nomad.nomad.route_2_west.Onterio_Beacon_Activity;
import com.nomad.nomad.route_2_west.Riverside_25_Activity;
import com.nomad.nomad.route_2_west.Seventh_Second_Activity;
import com.nomad.nomad.route_2_west.University_And_15_Activity;
import com.nomad.nomad.route_2_west.Willey_Hall_Activity;

import java.util.ArrayList;

public class route_2_west_stops_Activity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_2_west_stops_);

        arrayList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.route_2_west_stops_listview);

        /**
         *
         *[{
         * 	"Text": "7th St  and 2nd Ave SE",
         * 	"Value": "7E2E"
         * }, {
         * 	"Text": "8th St and E Hennepin Ave",
         * 	"Value": "8EHE"
         * }, {
         * 	"Text": "University Ave  and 15th Ave ",
         * 	"Value": "15UN"
         * }, {
         * 	"Text": "Ontario St  and Beacon St ",
         * 	"Value": "ONBE"
         * }, {
         * 	"Text": "Willey Hall ",
         * 	"Value": "WIHA"
         * }, {
         * 	"Text": "Riverside Ave and 25th Ave ",
         * 	"Value": "25RV"
         * }, {
         * 	"Text": "Franklin Ave Station",
         * 	"Value": "FRHI"
         * }, {
         * 	"Text": "Franklin Ave and Chicago Ave",
         * 	"Value": "CHFR"
         * }, {
         * 	"Text": "Franklin Ave and Nicollet Ave",
         * 	"Value": "NIFR"
         * }, {
         * 	"Text": "Hennepin Ave and Franklin Ave",
         * 	"Value": "FRHE"
         * }]
         */

        arrayList.add("7th St  and 2nd Ave SE");
        arrayList.add("8th St and E Hennepin Ave");
        arrayList.add("University Ave  and 15th Ave ");
        arrayList.add("Ontario St  and Beacon St ");
        arrayList.add("Willey Hall ");
        arrayList.add("Riverside Ave and 25th Ave ");
        arrayList.add("Franklin Ave Station");
        arrayList.add("Franklin Ave and Chicago Ave\"");
        arrayList.add("Franklin Ave and Nicollet Ave");
        arrayList.add("Hennepin Ave and Franklin Ave");


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
                        // 7th
                        startActivity(new Intent(route_2_west_stops_Activity.this, Seventh_Second_Activity.class));
                        break;

                    case 1:
                        // 8th
                        startActivity(new Intent(route_2_west_stops_Activity.this, Eight_and_hennipen_Activity.class));
                        break;

                    case 2:
                        // University
                        startActivity(new Intent(route_2_west_stops_Activity.this, University_And_15_Activity.class));
                        break;

                    case 3:
                        // Onterio
                        startActivity(new Intent(route_2_west_stops_Activity.this, Onterio_Beacon_Activity.class));
                        break;

                    case 4:
                        // WIlley
                        startActivity(new Intent(route_2_west_stops_Activity.this, Willey_Hall_Activity.class));
                        break;

                    case 5:
                        // Riverside
                        startActivity(new Intent(route_2_west_stops_Activity.this, Riverside_25_Activity.class));
                        break;

                    case 6:
                        //
                        startActivity(new Intent(route_2_west_stops_Activity.this, Franklin_Ave_Station_Activity.class));
                        break;

                    case 7:
                        startActivity(new Intent(route_2_west_stops_Activity.this, Franklin_Ave_Chicago_Activity.class));
                        break;


                    case 8:
                        startActivity(new Intent(route_2_west_stops_Activity.this, Franklin_Ave_Nicollet_Activity.class));
                        break;

                    case 9:
                        startActivity(new Intent(route_2_west_stops_Activity.this, Heenipen_And_Franklin_Activity.class));
                        break;



                }
            }
        });





    }
}
