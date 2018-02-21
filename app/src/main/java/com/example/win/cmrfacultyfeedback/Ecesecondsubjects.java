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

public class Ecesecondsubjects extends AppCompatActivity {
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

        b_m4.setText("MATHEMATICS-III");
        b_ds.setText("PROBABILITY THEORY AND STOCHASTIC PROCESSES");
        b_mfcs.setText("SWITCHING THEORY AND LOGIC DESIGN");
        b_dld.setText("ELECTRICAL CIRCUITS");
        b_java.setText("ELECTRONIC DEVICES AND CIRCUITS");
        b_dslab.setText("ELECTRONIC DEVICES AND CIRCUITS LAB");
        b_it.setText("SIGNALS AND SYSTEMS");
        b_javalab.setText("BASIC SIMULATION LAB");
        b_es.setText("ENVIRONMENTAL STUDIES");
        b_m4.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                sub=1;
                Intent four=new Intent(Ecesecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ds.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=2;
                Intent four=new Intent(Ecesecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_mfcs.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=3;
                Intent four=new Intent(Ecesecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dld.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                sub=4;
                Intent four=new Intent(Ecesecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_java.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=5;
                Intent four=new Intent(Ecesecondsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_dslab.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=6;
                Intent four=new Intent(Ecesecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_it.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=7;
                Intent four=new Intent(Ecesecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_javalab.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                sub=8;
                Intent four=new Intent(Ecesecondsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "MATHEMATICS-III";
            case 2:
                return "PROBABILITY THEORY AND STOCHASTIC PROCESSES";
            case 3:
                return "SWITCHING THEORY AND LOGIC DESIGN";
            case 4:
                return "ELECTRICAL CIRCUITS";
            case 5:
                return "ELECTRONIC DEVICES AND CIRCUITS";
            case 6:
                return "ELECTRONIC DEVICES AND CIRCUITS LAB";
            case 7:
                return "SIGNALS AND SYSTEMS";
            case 8:
                return "BASIC SIMULATION LAB";

        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }

}
