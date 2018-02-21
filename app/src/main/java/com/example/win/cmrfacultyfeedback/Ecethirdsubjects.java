package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by win on 16/12/2017.
 */

public class Ecethirdsubjects extends AppCompatActivity {
    private Button b_ppl,b_se,b_cd,b_os,b_oslab,b_cdlab,b_cn,b_ipr,b_es;
    private TextView textView;
    private static int sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthyearsubjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_ppl=(Button)findViewById(R.id.linux);
        b_se=(Button)findViewById(R.id.design);
        b_cd=(Button)findViewById(R.id.cloud);
        b_os=(Button)findViewById(R.id.dwdm);
        b_oslab=(Button)findViewById(R.id.linuxlab);
        b_cdlab=(Button)findViewById(R.id.dwdmlab);
        b_cn=(Button)findViewById(R.id.elective1);
        b_ipr=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);
        b_es.setVisibility(View.INVISIBLE);

        b_ppl.setText("CONTROL SYSTEMS ENGINEERING");
        b_se.setText("COMPUTER ORGANIZATION AND OPERATING SYSTEMS");
        b_cd.setText("ANTENNAS AND WAVE PROPAGATION");
        b_os.setText("ELECTRONIC MEASUREMENTS AND INSTRUMENTATION");
        b_oslab.setText("ANALOG COMMUNICATIONS LAB");
        b_cdlab.setText("IC APPLICATIONS AND HDL SIMULATION LAB");
        b_cn.setText("ANALOG COMMUNICATIONS");
        b_ipr.setText("LINEAR AND DIGITAL IC APPLICATIONS");
        b_ppl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=1;
                Intent four=new Intent(Ecethirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(Ecethirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(Ecethirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(Ecethirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_oslab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(Ecethirdsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cdlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(Ecethirdsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(Ecethirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_ipr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(Ecethirdsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "CONTROL SYSTEMS ENGINEERING";
            case 2:
                return "COMPUTER ORGANIZATION AND OPERATING SYSTEMS";
            case 3:
                return "ANTENNAS AND WAVE PROPAGATION";
            case 4:
                return "ELECTRONIC MEASUREMENTS AND INSTRUMENTATION";
            case 5:
                return "ANALOG COMMUNICATIONS LAB";
            case 6:
                return "IC APPLICATIONS AND HDL SIMULATION LAB";
            case 7:
                return "ANALOG COMMUNICATIONS";
            case 8:
                return "LINEAR AND DIGITAL IC APPLICATIONS";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
}

