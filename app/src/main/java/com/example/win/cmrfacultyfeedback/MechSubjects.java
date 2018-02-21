package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class MechSubjects extends AppCompatActivity {
    private Button b_or,b_ppe,b_cdcm,b_ics,b_elective1,b_elective2,b_cadmlab,b_pdpilab,b_es;
    private TextView textView;
    private static int sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech_subjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_or=(Button)findViewById(R.id.or);
        b_ppe=(Button)findViewById(R.id.ppe);
        b_cdcm=(Button)findViewById(R.id.cdcm);
        b_ics=(Button)findViewById(R.id.ics);
        b_cadmlab=(Button)findViewById(R.id.cadmlab);
        b_pdpilab=(Button)findViewById(R.id.pdpilab);
        b_elective1=(Button)findViewById(R.id.elective1);
        b_elective2=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);
        b_es.setVisibility(View.INVISIBLE);
        b_or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=1;
                Intent four=new Intent(MechSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cadmlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(MechSubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ppe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(MechSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_cdcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(MechSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(MechSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));

                startActivity(four);

            }
        });
        b_pdpilab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(MechSubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_elective1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(MechSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_elective2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(MechSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "OPERATIONS RESEARCH";
            case 2:
                return "CADM LAB";
            case 3:
                return "POWER PLANT ENGINEERING";
            case 4:
                return "CAD/CAM";
            case 5:
                return "INSTRUMENTATION AND CONTROL SYSTEMS";
            case 6:
                return "PDPI LAB";
            case 7:
                return "ROBOTICS";
            case 8:
                return "MOBILE COMPUTING";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
    }

