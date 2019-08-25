package com.nomad.nomad.route_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nomad.nomad.R;
import com.nomad.nomad.route_2_east_stops_panel.route_2_east_stops_Activity;
import com.nomad.nomad.route_2_west_stops_panel.route_2_west_stops_Activity;

import org.w3c.dom.Text;

public class EastWestActivity extends AppCompatActivity {

    private Button eastbtn,westbtn,helpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_west);

        eastbtn = (Button)findViewById(R.id.route_2_east_direciton_btn);
        westbtn = (Button)findViewById(R.id.route_2_west_direction_btn);
        helpbtn = (Button)findViewById(R.id.helpBtn);


        helpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder dialog = new AlertDialog.Builder(EastWestActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.notify_layout,null);

                // Define the views inside the dialog box
                final EditText et_name = (EditText)mView.findViewById(R.id.etYourName);
                final EditText et_Email = (EditText)mView.findViewById(R.id.etemail);

                Button mLogin = (Button)mView.findViewById(R.id.button_login);

                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        String entered_name = et_name.getText().toString();
                        String entered_email = et_Email.getText().toString();

                        if (TextUtils.isEmpty(entered_name) || TextUtils.isEmpty(entered_email)){
                            Toast.makeText(EastWestActivity.this,
                                    "These fields cannot be empty.", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(EastWestActivity.this,
                                    "Thank you, we'll respond to you soon.", Toast.LENGTH_SHORT).show();
                        }


                    }
                });

                dialog.setView(mView);
                AlertDialog showDialog = dialog.create();
                showDialog.show();



//                AlertDialog dialog = new AlertDialog.Builder(EastWestActivity.this).setTitle("Help Dialog...")
//                        .setMessage("Please email us @ : thenomadbus@gmail.com\n\nIf you have any questions or concerns, thank you.").show();
//                TextView textView =(TextView)dialog.findViewById(android.R.id.message);
//
//                textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 22);
//
//                textView.setTypeface(null, Typeface.BOLD_ITALIC);
//

            }
        });


        eastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent east_direction = new Intent(EastWestActivity.this, route_2_east_stops_Activity.class);
                startActivity(east_direction);

            }
        });

        westbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent west_direction = new Intent(EastWestActivity.this,
                        route_2_west_stops_Activity.class);
                startActivity(west_direction);

            }
        });
    }
}
