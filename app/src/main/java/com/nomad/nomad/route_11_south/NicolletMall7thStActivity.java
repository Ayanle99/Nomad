package com.nomad.nomad.route_11_south;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.nomad.nomad.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NicolletMall7thStActivity extends AppCompatActivity {

    private Button load_btn;
    private TextView result_Textview, current_time;
    private ArrayList<String> arrayList = new ArrayList<String>();
    private String rs = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nicollet_mall7th_st);

        load_btn = (Button)findViewById(R.id.nicollet_mall_7th_btn);
        result_Textview = (TextView)findViewById(R.id.nicollet_mall_7th_textview);
        current_time = (TextView)findViewById(R.id.current_time);

        Thread time_Thread = new Thread(){

            @Override
            public void run() {
                try{

                    while(!isInterrupted()){


                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Date d=new Date();
                                SimpleDateFormat sdf=new SimpleDateFormat("hh:mm a");
                                String currentDateTimeString = sdf.format(d);
                                current_time.setText("Current Time : " +currentDateTimeString);
                            }
                        });
                    }

                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        };
        time_Thread.start();




        load_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                load_btn.setBackgroundColor(Color.RED);
                load_btn.setText("Please Wait.....");
                view.setClickable(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        view.setClickable(true);

                        load_btn.setBackgroundResource(R.drawable.round_btn);
                        load_btn.setText("Load Times");

                        getTimes();

                    }
                    // Wait at least 30 seconds before you make a call to the servers,
                    // If you don't do this, your app will be restricted/or banned.
                    // Please make sure to not make accessive calls to their servers.
                },30000);
            }
        });



    }
    private void getTimes() {

        result_Textview.setText("Fetching scheduled times.....");

        new Thread(new Runnable() {
            @Override
            public void run() {
                final StringBuilder builder = new StringBuilder();


                try {

                    Document doc = Jsoup.connect("http://svc.metrotransit.org/NexTrip/11/1/7SNI").get();
                    Elements times = doc.select("DepartureText");

                    rs += times.text();

                    for (Element time : times) {
                        builder.append("\n").append("Arriving : ").append(time.text()).append("\n\n");
                        arrayList.add(time.text());
                    }


                } catch (IOException e) {
                    builder.append("Error : ").append(e.getMessage()).append("\n");
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        result_Textview.setText("");
                        result_Textview.setMovementMethod(new ScrollingMovementMethod());
                        result_Textview.setText(builder.toString());

                        String[] sp = rs.split(" ");

                        Toast.makeText(NicolletMall7thStActivity.this,
                                rs, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        }).start();
    }

}
