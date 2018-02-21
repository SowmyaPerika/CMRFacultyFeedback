package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class CivilSubjects extends AppCompatActivity {
    private Button b_rsg,b_te,b_eas,b_wre,b_elective1,b_elective2,b_chmlab,b_eelab,b_es;
    private TextView textView;
    private static int sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_subjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_rsg=(Button)findViewById(R.id.rsg);
        b_te=(Button)findViewById(R.id.te);
        b_eas=(Button)findViewById(R.id.eas);
        b_wre=(Button)findViewById(R.id.wre);
        b_chmlab=(Button)findViewById(R.id.chmlab);
        b_eelab=(Button)findViewById(R.id.eelab);
        b_elective1=(Button)findViewById(R.id.elective1);
        b_elective2=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);
        b_es.setVisibility(View.INVISIBLE);

        b_rsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=1;
                Intent four=new Intent(CivilSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_chmlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(CivilSubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(CivilSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_eas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(CivilSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_wre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(CivilSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_eelab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(CivilSubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_elective1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(CivilSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_elective2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(CivilSubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "REMOTE SENSING AND GIS";
            case 2:
                return "CHM LAB";
            case 3:
                return "TRANSPORTATION ENGINEERING-II";
            case 4:
                return "ESTIMATION AND COSTING";
            case 5:
                return "WATER RESOURCES ENGINEERING-II";
            case 6:
                return "EE LAB";
            case 7:
                return "WATERSHED MANAGEMENT";
            case 8:
                return "INDUSTRIAL WASTE WATER TREATMENT";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
    }

