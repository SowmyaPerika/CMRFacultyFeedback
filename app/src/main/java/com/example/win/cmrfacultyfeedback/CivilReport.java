package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class CivilReport extends AppCompatActivity {
    private TextView textview10,textview14,textview16,textview12,textview18,textview20,textview22,textview24,textview26;
    private TextView textview8,textview11,textview13,textview15,textview17,textview19,textview21,textview23,textview25;
    private Firebase mref;
    private Button b1;
    float i;
    int c=0,k=0,j=0,l=0,m=0,n=0,o=0,p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_report);

        Firebase.setAndroidContext(this);
        b1 = (Button) findViewById(R.id.b1);

        textview8=(TextView)findViewById(R.id.textView8);
        textview11=(TextView)findViewById(R.id.textView11);
        textview13=(TextView)findViewById(R.id.textView13);
        textview15=(TextView)findViewById(R.id.textView15);
        textview17=(TextView)findViewById(R.id.textView17);
        textview19=(TextView)findViewById(R.id.textView19);
        textview21=(TextView)findViewById(R.id.textView21);
        textview23=(TextView)findViewById(R.id.textView23);
        textview25=(TextView)findViewById(R.id.textView25);

        textview10=(TextView)findViewById(R.id.textView10);
        textview14=(TextView)findViewById(R.id.textView14);
        textview16=(TextView)findViewById(R.id.textView16);
        textview12=(TextView)findViewById(R.id.textView12);
        textview18=(TextView)findViewById(R.id.textView18);
        textview20=(TextView)findViewById(R.id.textView20);
        textview22=(TextView)findViewById(R.id.textView22);
        textview24=(TextView)findViewById(R.id.textView24);
        textview26=(TextView)findViewById(R.id.textView26);
        final String yr=getIntent().getExtras().getString("year");
        final String  sect=getIntent().getExtras().getString("section");
        final String  br=getIntent().getExtras().getString("branch");

        mref=new Firebase("https://cmrfacultyfeedback-abc78.firebaseio.com/").child(br).child(yr).child(sect);

        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String sub;
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {

                    sub = dataSnapshot1.getKey();
                    if (sub.equals("REMOTE SENSING AND GIS")) {
                        float total = 0;
                        for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                            k++;
                            String temp = dataSnapshot2.child("total").getValue().toString();
                            total = total + Float.valueOf(temp);
                        }

                        i = ((total / (k * 50)) * 100);
                        textview10.setText(i + "");
                    } else {
                        if (sub.equals("TRANSPORTATION ENGINEERING-II")) {
                            float total = 0;
                            for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                c++;
                                String temp = dataSnapshot2.child("total").getValue().toString();
                                total = total + Float.valueOf(temp);
                            }

                            i = ((total / (c * 50)) * 100);
                            textview14.setText(i + "");
                        } else {
                            if (sub.equals("ESTIMATION AND COSTING")) {
                                float total = 0;
                                for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                    j++;
                                    String temp = dataSnapshot2.child("total").getValue().toString();
                                    total = total + Float.valueOf(temp);
                                }

                                i = ((total / (j * 50)) * 100);
                                textview12.setText(i + "");

                            } else {
                                if (sub.equals("WATER RESOURCES ENGINEERING-II")) {
                                    float total = 0;
                                    for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                        l++;
                                        String temp = dataSnapshot2.child("total").getValue().toString();
                                        total = total + Float.valueOf(temp);
                                    }

                                    i = ((total / (l * 50)) * 100);
                                    textview20.setText(i + "");
                                }else{
                                    if(sub.equals("WATERSHED MANAGEMENT")) {
                                        float total = 0;
                                        for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                            m++;
                                            String temp = dataSnapshot2.child("total").getValue().toString();
                                            total = total + Float.valueOf(temp);
                                        }
                                        i = ((total / (m * 50)) * 100);
                                        textview18.setText(i + "");
                                    }else{
                                        if(sub.equals("INDUSTRIAL WASTE WATER TREATMENT")) {
                                            float total = 0;
                                            for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                                n++;
                                                String temp = dataSnapshot2.child("total").getValue().toString();
                                                total = total + Float.valueOf(temp);
                                            }
                                            i = ((total / (n * 50)) * 100);
                                            textview16.setText(i + "");

                                        }else{
                                            if(sub.equals("CHM LAB")) {
                                                float total = 0;
                                                for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                                    o++;
                                                    String temp = dataSnapshot2.child("total").getValue().toString();
                                                    total = total + Float.valueOf(temp);
                                                }
                                                i = ((total / (o * 25)) * 100);
                                                textview22.setText(i + "");

                                            }else {
                                                float total = 0;
                                                for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                                    p++;
                                                    String temp = dataSnapshot2.child("total").getValue().toString();
                                                    total = total + Float.valueOf(temp);
                                                }
                                                i = ((total / (p * 25)) * 100);
                                                textview24.setText(i + "");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Toast.makeText(CivilReport.this, "The number of students given the rating are"+k, Toast.LENGTH_SHORT).show();
                final String lp = textview10.getText().toString();
                final String cc = textview12.getText().toString();
                final String dp = textview14.getText().toString();
                final String dwdm = textview16.getText().toString();
                final String mc = textview18.getText().toString();
                final String irs = textview20.getText().toString();
                final String dl = textview22.getText().toString();
                final String ll = textview24.getText().toString();
                final String optional = textview26.getText().toString();

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(CivilReport.this, Graph.class);
                        i.putExtra("percentage", lp);
                        i.putExtra("cc",cc);
                        i.putExtra("dp",dp);
                        i.putExtra("dwdm",dwdm);
                        i.putExtra("mc",mc);
                        i.putExtra("irs",irs);
                        i.putExtra("dl",dl);
                        i.putExtra("ll",ll);
                        i.putExtra("opt",optional);
                        i.putExtra("year",yr);
                        i.putExtra("branch",br);
                        startActivity(i);
                    }
                });
            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
}


