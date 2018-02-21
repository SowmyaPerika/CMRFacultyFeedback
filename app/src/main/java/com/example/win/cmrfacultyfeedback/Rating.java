package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class Rating extends AppCompatActivity {
    private Firebase mref,ref,mchi;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    private RatingBar r1, r2, r3, r4, r5, r6, r7, r8, r9, r10;
    private String years,subjects,sections,branch;
    private Button submits;
    float a[] = new float[10];
    String b[] = new String[10];
    float total = 0;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        setTitle("Subject Rating");

        Firebase.setAndroidContext(this);
        mref=new Firebase("https://cmrfacultyfeedback-abc78.firebaseio.com/");
        years = String.valueOf(YearActivity.getYear());
        branch=String.valueOf(Branch.getbranch());
        int year=YearActivity.getId();
        final String rollnumber = getIntent().getExtras().getString("roll");

        if(rollnumber.substring(7,8).equals("5")) {

            if (year == 4) {
                subjects = String.valueOf(Fourthyearsubjects.getSubject());
            } else if (year == 3 || year == 5) {
                subjects = String.valueOf(Thirdyearsubjects.getSubject());
            } else if (year == 2 || year == 6) {
                subjects = String.valueOf(Secondyearsubjects.getSubject());
            } else {
                subjects = String.valueOf(Firstyearsubjects.getSubject());
            }
        }
        if(rollnumber.substring(7,8).equals("4")) {

            if (year == 4) {
                subjects = String.valueOf(EceSubjects.getSubject());
            } else if (year == 3) {
                subjects = String.valueOf(Ecethirdsubjects.getSubject());
            } else if (year == 2) {
                subjects = String.valueOf(Ecesecondsubjects.getSubject());
            } else {
                subjects = String.valueOf(Firstyearsubjects.getSubject());
            }
        }
        if(rollnumber.substring(7,8).equals("1")) {

            if (year == 4) {
                subjects = String.valueOf(CivilSubjects.getSubject());
            } else if (year == 3 ) {
                subjects = String.valueOf(Civilthirdsubjects.getSubject());
            } else if (year == 2 ) {
                subjects = String.valueOf(Civilsecondsubjects.getSubject());
            } else {
                subjects = String.valueOf(Firstyearsubjects.getSubject());

            }
        }
        if(rollnumber.substring(7,8).equals("3")) {

            if (year == 4) {
                subjects = String.valueOf(MechSubjects.getSubject());
            } else if (year == 3 ) {
                subjects = String.valueOf(Mechthirdsubjects.getSubject());
            } else if (year == 2 ) {
                subjects = String.valueOf(Mechsecondsubjects.getSubject());
            } else {
                subjects = String.valueOf(Firstyearsubjects.getSubject());

            }
        }
        sections = String.valueOf(Section.getSection());
        r1 = (RatingBar) findViewById(R.id.rate1);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        r2 = (RatingBar) findViewById(R.id.rate2);
        t3 = (TextView) findViewById(R.id.t3);
        r3 = (RatingBar) findViewById(R.id.rate3);
        t4 = (TextView) findViewById(R.id.t4);
        r4 = (RatingBar) findViewById(R.id.rate4);
        t5 = (TextView) findViewById(R.id.t5);
        r5 = (RatingBar) findViewById(R.id.rate5);
        t6 = (TextView) findViewById(R.id.t6);
        r6 = (RatingBar) findViewById(R.id.rate6);
        t8 = (TextView) findViewById(R.id.t8);
        r8 = (RatingBar) findViewById(R.id.rate8);
        t9 = (TextView) findViewById(R.id.t9);
        t7 = (TextView) findViewById(R.id.t7);
        r7 = (RatingBar) findViewById(R.id.rate7);
        r9 = (RatingBar) findViewById(R.id.rate9);
        t10 = (TextView) findViewById(R.id.t10);
        r10 = (RatingBar) findViewById(R.id.rate10);
        submits = (Button) findViewById(R.id.button2);
        submits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[0] = t1.getText().toString();
                b[1] = t2.getText().toString();
                b[2] = t3.getText().toString();
                b[3] = t4.getText().toString();
                b[4] = t5.getText().toString();
                b[5] = t6.getText().toString();
                b[6] = t7.getText().toString();
                b[7] = t8.getText().toString();
                b[8] = t9.getText().toString();
                b[9] = t10.getText().toString();
                a[0] = r1.getRating();
                a[1] = r2.getRating();
                a[2] = r3.getRating();
                a[3] = r4.getRating();
                a[4] = r5.getRating();
                a[5] = r6.getRating();
                a[6] = r7.getRating();
                a[7] = r8.getRating();
                a[8] = r9.getRating();
                a[9] = r10.getRating();


                for (i = 0; i < 10; i++) {
                    Firebase mchi = mref.child(branch).child(years).child(sections).child(subjects).child(rollnumber).child(b[i]);
                    mchi.setValue(a[i]);
                }
                for (i = 0; i < 10; i++) {
                    total = total + a[i];
                }
                Firebase mchi = mref.child(branch).child(years).child(sections).child(subjects).child(rollnumber).child("total");
                mchi.setValue(total);
                Toast.makeText(Rating.this, "Rating Submitted", Toast.LENGTH_SHORT).show();
                Intent s = new Intent(Rating.this, Conclusion.class);
                startActivity(s);
                finish();
            }
        });

    }
}
