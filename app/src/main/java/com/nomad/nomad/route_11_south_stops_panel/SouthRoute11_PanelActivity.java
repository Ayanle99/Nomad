package com.nomad.nomad.route_11_south_stops_panel;

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
import com.nomad.nomad.route_11_south.ColumbiaHeightsTransitCenterActivity;
import com.nomad.nomad.route_11_south.DeLaSalle_High_School_Activity;
import com.nomad.nomad.route_11_south.Fourth_And_38_St_Activity;
import com.nomad.nomad.route_11_south.Fourth_Ave_And_Lake_Activity;
import com.nomad.nomad.route_11_south.Grand_St_and_29th_Ave_Activity;
import com.nomad.nomad.route_11_south.I_35_46_Activity;
import com.nomad.nomad.route_11_south.Lowry_Ave_NE_and_2nd_St_NE_Activity;
import com.nomad.nomad.route_11_south.NicolletMall7thStActivity;
import com.nomad.nomad.route_11_south.Nicollet_Ave_46_St_Activity;
import com.nomad.nomad.route_11_south.Nicollet_Ave_And_Grant_Activity;
import com.nomad.nomad.route_11_south.Nicollet_Mall_3rd_st_Activity;
import com.nomad.nomad.route_11_south.Pleasant_Ave_50th_Activity;
import com.nomad.nomad.route_11_south.Third_And_Franklin_Activity;

import java.util.ArrayList;

public class SouthRoute11_PanelActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_route11__panel);


        arrayList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.south_direction_route_11);

        /**
         *
         * [{
         * 	"Text": "Columbia Heights Transit Center",
         * 	"Value": "41CE"
         * }, {
         * 	"Text": "Grand St  and 29th Ave ",
         * 	"Value": "29GR"
         * }, {
         * 	"Text": "Lowry Ave NE and 2nd St NE",
         * 	"Value": "LW2S"
         * }, {
         * 	"Text": "DeLaSalle High School",
         * 	"Value": "DELA"
         * }, {
         * 	"Text": "Nicollet Mall and 3rd St ",
         * 	"Value": "3SNI"
         * }, {
         * 	"Text": "Nicollet Mall and 7th St ",
         * 	"Value": "7SNI"
         * }, {
         * 	"Text": "Nicollet Ave and Grant St",
         * 	"Value": "GRNI"
         * }, {
         * 	"Text": "3rd Ave  and Franklin Ave",
         * 	"Value": "3AFR"
         * }, {
         * 	"Text": "4th Ave  and Lake St",
         * 	"Value": "4ALA"
         * }, {
         * 	"Text": "4th Ave  and 38th St",
         * 	"Value": "384A"
         * }, {
         * 	"Text": "I-35W  and 46th St Station",
         * 	"Value": "I346"
         * }, {
         * 	"Text": "Nicollet Ave and 46th St",
         * 	"Value": "46NI"
         * }, {
         * 	"Text": "Pleasant Ave and 50th St\/Busch Terrace",
         * 	"Value": "50PL"
         * }]
         */

        arrayList.add("Columbia Heights Transit Center");
        arrayList.add("Grand St  and 29th Ave ");
        arrayList.add("Lowry Ave NE and 2nd St NE");
        arrayList.add("DeLaSalle High School");
        arrayList.add("Nicollet Mall and 3rd St ");
        arrayList.add("Nicollet Mall and 7th St ");
        arrayList.add("Nicollet Ave and Grant St");
        arrayList.add("3rd Ave  and Franklin Ave");
        arrayList.add("4th Ave  and Lake St");
        arrayList.add("4th Ave  and 38th St");
        arrayList.add("I-35W  and 46th St Station");
        arrayList.add("Nicollet Ave and 46th St");
        arrayList.add("Pleasant Ave and 50th St\\/Busch Terrace");


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
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                ColumbiaHeightsTransitCenterActivity.class));
                        break;

                    case 1:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Grand_St_and_29th_Ave_Activity
                                        .class));
                        break;

                    case 2:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Lowry_Ave_NE_and_2nd_St_NE_Activity

                                        .class));
                        break;

                    case 3:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                DeLaSalle_High_School_Activity

                                        .class));
                        break;

                    case 4:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Nicollet_Mall_3rd_st_Activity


                                        .class));
                        break;

                    case 5:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                NicolletMall7thStActivity.class));
                        break;

                    case 6:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Nicollet_Ave_And_Grant_Activity.class));
                        break;

                    case 7:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Third_And_Franklin_Activity.class));
                        break;

                    case 8:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Fourth_Ave_And_Lake_Activity.class));
                        break;

                    case 9:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Fourth_And_38_St_Activity.class));
                        break;

                    case 10:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                I_35_46_Activity.class));
                        break;

                    case 11:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Nicollet_Ave_46_St_Activity.class));
                        break;

                    case 12:
                        startActivity(new Intent(SouthRoute11_PanelActivity.this,
                                Pleasant_Ave_50th_Activity.class));
                        break;


                }
            }
        });

    }
}
