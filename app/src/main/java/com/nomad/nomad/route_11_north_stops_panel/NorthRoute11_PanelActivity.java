package com.nomad.nomad.route_11_north_stops_panel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.nomad.nomad.R;

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
         * 	"Text": "Pleasant Ave and 50th St\/Busch Terrace",
         * 	"Value": "50PL"
         * }, {
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
         */

        arrayList.add("Pleasant Ave and 50th St\\/Busch Terrace\"");
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

    }
}
