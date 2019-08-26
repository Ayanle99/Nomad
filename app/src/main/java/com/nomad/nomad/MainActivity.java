package com.nomad.nomad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.nomad.nomad.route_11.NorthSouthActivity;
import com.nomad.nomad.route_2.EastWestActivity;

public class MainActivity extends AppCompatActivity {

    private ListView mListview;
    private Button go_to_metro_transit_website_btn;

    private int [] images = {

            R.drawable.bus_icon,
            R.drawable.bus_icon

    };
    private String[] routes = {
            "Bus # 2",
            "Bus # 11"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListview = (ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        mListview.setAdapter(customAdapter);

        go_to_metro_transit_website_btn = (Button)findViewById(R.id.goToMetroTransitWebsite_btn);

        go_to_metro_transit_website_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OpenWebPageActivity.class));
            }
        });


        mListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(MainActivity.this,
                                EastWestActivity.class));
                        break;

                    case 1:
                        startActivity(new Intent(MainActivity.this,
                                NorthSouthActivity.class));
                        break;
                }
            }
        });




    }
    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView  imageView = view.findViewById(R.id.imageView);
            TextView tv = (TextView)view.findViewById(R.id.textview);
            imageView.setImageResource(images[position]);

            tv.setText(routes[position]);

            return view;
        }
    }
}
