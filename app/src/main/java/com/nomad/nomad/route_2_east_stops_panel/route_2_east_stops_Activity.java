package com.nomad.nomad.route_2_east_stops_panel;

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
import com.nomad.nomad.route_2_east.And_HActivity;
import com.nomad.nomad.route_2_east.FACAActivity;
import com.nomad.nomad.route_2_east.FAHAActivity;
import com.nomad.nomad.route_2_east.FANAActivity;
import com.nomad.nomad.route_2_east.FASActivity;
import com.nomad.nomad.route_2_east.F_15Activity;
import com.nomad.nomad.route_2_east.H_8Activity;
import com.nomad.nomad.route_2_east.Henn22Activity;
import com.nomad.nomad.route_2_east.ON_HActivity;
import com.nomad.nomad.route_2_east.Riv25Activity;
import com.nomad.nomad.route_2_east.S_2Activity;

import java.util.ArrayList;

public class route_2_east_stops_Activity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_2_east_stops_);

        arrayList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.route_2_east_stops_listview);

        arrayList.add("Hennepin Ave and 22nd St");
        arrayList.add("Franklin Ave and Hennepin Ave");
        arrayList.add("Franklin Ave and Nicollet Ave\"");
        arrayList.add("Franklin Ave and Chicago Ave");
        arrayList.add("Franklin Ave Station");
        arrayList.add("Riverside Ave and 25th Ave ");
        arrayList.add("Anderson Hall ");
        arrayList.add("Ontario St  and Beacon St ");
        arrayList.add("4th St  and 15th Ave ");
        arrayList.add("E Hennepin Ave and 8th St ");
        arrayList.add("7th St  and 2nd Ave SE");


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
                        startActivity(new Intent(route_2_east_stops_Activity.this, Henn22Activity.class));
                        break;
                    case 1:
                        startActivity(new Intent(route_2_east_stops_Activity.this, FAHAActivity.class));
                        break;

                    case 2:
                        startActivity(new Intent(route_2_east_stops_Activity.this, FANAActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(route_2_east_stops_Activity.this, FACAActivity.class));
                        break;

                    case 4:
                        startActivity(new Intent(route_2_east_stops_Activity.this, FASActivity.class));
                        break;

                    case 5:
                        startActivity(new Intent(route_2_east_stops_Activity.this, Riv25Activity.class));
                        break;

                    case 6:
                        startActivity(new Intent(route_2_east_stops_Activity.this, And_HActivity.class));
                        break;

                    case 7:
                        startActivity(new Intent(route_2_east_stops_Activity.this,
                                ON_HActivity.class));
                        break;

                    case 8:
                        startActivity(new Intent(route_2_east_stops_Activity.this,
                                F_15Activity.class));
                        break;

                    case 9:
                        startActivity(new Intent(route_2_east_stops_Activity.this,
                                H_8Activity.class));
                        break;

                    case 10:
                        startActivity(new Intent(route_2_east_stops_Activity.this,
                                S_2Activity.class));
                        break;





                }
            }
        });
    }
}
