package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class LabRating extends AppCompatActivity {
    private Firebase mref,ref;
    private Button submits;
    private String years,subjects,sections,branch;
    private RatingBar r1,r2,r3,r4,r5;
    private TextView t1,t2,t3,t4,t5;
    float total=0;
    int i=0;
    float a[]=new float[5];
    String b[]=new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_rating);

        setTitle("Lab Rating");
        Firebase.setAndroidContext(this);
        mref = new Firebase("https://cmrfacultyfeedback-abc78.firebaseio.com/");

        submits=(Button)findViewById(R.id.button2);
        r1=(RatingBar)findViewById(R.id.rate1);
        t1=(TextView)findViewById(R.id.t1);
        r2=(RatingBar)findViewById(R.id.rate2);
        t2=(TextView)findViewById(R.id.t2);
        r3=(RatingBar)findViewById(R.id.rate3);
        t3=(TextView)findViewById(R.id.t3);
        r4=(RatingBar)findViewById(R.id.rate4);
        t4=(TextView)findViewById(R.id.t4);
        r5=(RatingBar)findViewById(R.id.rate5);
        t5=(TextView)findViewById(R.id.t5);
        submits.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                b[0]=t1.getText().toString();
                b[1]=t2.getText().toString();
                b[2]=t3.getText().toString();
                b[3]=t4.getText().toString();
                b[4]=t5.getText().toString();
                a[0]=r1.getRating();
                a[1]=r2.getRating();
                a[2]=r3.getRating();
                a[3]=r4.getRating();
                a[4]=r5.getRating();
                years = String.valueOf(YearActivity.getYear());
                branch=String.valueOf(Branch.getbranch());
                int year=YearActivity.getId();
                String rollnumber = getIntent().getExtras().getString("roll");
                if(rollnumber.substring(7,8).equals("5"))
                {
                    if(year==4){
                        subjects = String.valueOf(Fourthyearsubjects.getSubject());
                    }else if(year==3 ||year == 5 ){
                        subjects = String.valueOf(Thirdyearsubjects.getSubject());
                    }else if(year==2||year == 6) {
                        subjects = String.valueOf(Secondyearsubjects.getSubject());
                    }else {
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
                for(i=0;i<5;i++)
                {
                    Firebase mchi = mref.child(branch).child(years).child(sections).child(subjects).child(rollnumber).child(b[i]);
                    mchi.setValue(a[i]);
                }
                for (i=0;i<5;i++)
                {
                    total=total+a[i];
                }
                Firebase mchi = mref.child(branch).child(years).child(sections).child(subjects).child(rollnumber).child("total");
                mchi.setValue(total);
                Toast.makeText(LabRating.this, "Rating Submitted", Toast.LENGTH_SHORT).show();
                Intent c=new Intent(LabRating.this,Conclusion.class);
                startActivity(c);
                finish();

            }
        });

    }
}
