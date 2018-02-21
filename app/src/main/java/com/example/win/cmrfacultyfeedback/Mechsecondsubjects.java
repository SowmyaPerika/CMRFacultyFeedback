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

public class Mechsecondsubjects extends AppCompatActivity {
    private Button b_m4,b_ds,b_mfcs,b_dld,b_java,b_dslab,b_it,b_javalab,b_es;
    private TextView textView;
    private static int sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthyearsubjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_m4=(Button)findViewById(R.id.linux);
        b_ds=(Button)findViewById(R.id.design);
        b_mfcs=(Button)findViewById(R.id.cloud);
        b_dld=(Button)findViewById(R.id.dwdm);
        b_java=(Button)findViewById(R.id.linuxlab);
        b_dslab=(Button)findViewById(R.id.dwdmlab);
        b_it=(Button)findViewById(R.id.elective1);
        b_javalab=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);
        b_es.setVisibility(View.INVISIBLE);

        b_m4.setText("PROBABILITY AND STATISTICS");
        b_ds.setText("ELECTRICAL AND ELECTRONIC ENGINEERING");
        b_mfcs.setText("MECHANICS OF SOLIDS");
        b_dld.setText("THERMODYNAMICS");
        b_java.setText("METALLURGY AND MATERIALS SCIENCE");
        b_dslab.setText("ELECTRICAL AND ELECTRONICS ENGINEERING LAB");
        b_it.setText("METALLURGY AND MECHANICS OF SOLIDS LAB");
        b_javalab.setText("ENVIRONMENTAL STUDIES");
        b_es.setText("ENVIRONMENTAL STUDIES");
        b_m4.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                sub=1;
                Intent four=new Intent(Mechsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ds.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=2;
                Intent four=new Intent(Mechsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_mfcs.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=3;
                Intent four=new Intent(Mechsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dld.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                sub=4;
                Intent four=new Intent(Mechsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_java.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=5;
                Intent four=new Intent(Mechsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dslab.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=6;
                Intent four=new Intent(Mechsecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_it.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=7;
                Intent four=new Intent(Mechsecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_javalab.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=8;
                Intent four=new Intent(Mechsecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "PROBABILITY AND STATISTICS";
            case 2:
                return "ELECTRICAL AND ELECTRONIC ENGINEERING";
            case 3:
                return "MECHANICS OF SOLIDS";
            case 4:
                return "THERMODYNAMICS";
            case 5:
                return "METALLURGY AND MATERIALS SCIENCE";
            case 6:
                return "ELECTRICAL AND ELECTRONICS ENGINEERING LAB";
            case 7:
                return "METALLURGY AND MECHANICS OF SOLIDS LAB";
            case 8:
                return "ENVIRONMENTAL STUDIES";

        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }
}

