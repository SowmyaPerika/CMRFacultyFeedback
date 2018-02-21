package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by win on 28/09/2017.
 */

public class Firstyearsubjects extends AppCompatActivity {
    private Button b_m1,b_ec,b_ep1,b_e,b_em,b_bee,b_elab,b_ew,b_es;
    private TextView textView;
    private static int sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthyearsubjects);
        setTitle("Subjects");

        Firebase.setAndroidContext(this);
        textView=(TextView)findViewById(R.id.textView2) ;
        b_m1=(Button)findViewById(R.id.linux);
        b_ec=(Button)findViewById(R.id.design);
        b_ep1=(Button)findViewById(R.id.cloud);
        b_e=(Button)findViewById(R.id.dwdm);
        b_em=(Button)findViewById(R.id.linuxlab);
        b_bee=(Button)findViewById(R.id.dwdmlab);
        b_elab=(Button)findViewById(R.id.elective1);
        b_ew=(Button)findViewById(R.id.elective2);
        b_es=(Button)findViewById(R.id.b_es);

        b_es.setVisibility(View.INVISIBLE);
        b_m1.setText("MATHEMATICS-I");
        b_ec.setText("ENGINEERING CHEMISTRY");
        b_ep1.setText("ENGINEERING PHYSICS-I");
        b_e.setText("PROFESSIONAL COMMUNICATION IN ENGLISH");
        b_em.setText("ENGINEERING MECHANICS");
        b_bee.setText("BASIC ELECTRICAL AND ELECTRONICS");
        b_elab.setText("ENGLISH LAB");
        b_ew.setText("ENGINEERING WORKSHOP");

        b_m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=1;
                Intent four=new Intent(Firstyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=2;
                Intent four=new Intent(Firstyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_ep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=3;
                Intent four=new Intent(Firstyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub=4;
                Intent four=new Intent(Firstyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=5;
                Intent four=new Intent(Firstyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=6;
                Intent four=new Intent(Firstyearsubjects.this,Rating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });
        b_elab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=7;
                Intent four=new Intent(Firstyearsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);
            }
        });
        b_ew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sub=8;
                Intent four=new Intent(Firstyearsubjects.this,LabRating.class);
                four.putExtra("roll",getIntent().getExtras().getString("roll"));
                startActivity(four);

            }
        });

    }
    public static String getSubject(){
        switch (getSubId()){
            case 1:
                return "MATHEMATICS-I";
            case 2:
                return "ENGINEERING CHEMISTRY";
            case 3:
                return "ENGINEERING PHYSICS-I";
            case 4:
                return "PROFESSIONAL COMMUNICATION IN ENGLISH";
            case 5:
                return "ENGINEERING MECHANICS";
            case 6:
                return "BASIC ELECTRICAL AND ELECTRONICS";
            case 7:
                return "ENGLISH LAB";
            case 8:
                return "ENGINEERING WORKSHOP";
        }
        return null;
    }

    public static int getSubId(){
        return sub;
    }

}
