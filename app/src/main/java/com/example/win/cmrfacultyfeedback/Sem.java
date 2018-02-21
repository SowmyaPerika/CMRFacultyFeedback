package com.example.win.cmrfacultyfeedback;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Sem extends AppCompatActivity {
    private Button button4,button5;
    private TextView textView12,textView9,textView28,textView7;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private Firebase mref;
    int c=0;
    float i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);
        setTitle("Seminar Report");

        //  final DatabaseReference mref= getInstance().
        //  getReferenceFromUrl("https://online-faculty-feedback.firebaseio.com/").child("facultyDetails");

       // mref = new Firebase("https://cmrfacultyfeedback-abc78.firebaseio.com/").child("facultyDetails");
        setTitle("Seminar");

        button5 = (Button) findViewById(R.id.button5);
        button4 = (Button) findViewById(R.id.button4);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView28=(TextView) findViewById(R.id.textView28);
        textView7=(TextView)findViewById(R.id.textView7);
        button4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(Sem.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener, year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setTitle("Select date");
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String date = year + "-" + month + "-" + dayOfMonth;
                textView7.setText(date);
            }
        };
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mref = new Firebase("https://cmrfacultyfeedback-abc78.firebaseio.com/").child("facultydetails");

                mref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        final String date = textView7.getText().toString();

                        float total = 0;
                        String sub;
                        String semrate, topic = null, name = null;
                        for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                            sub = dataSnapshot1.getKey();
                            if (sub.equals(date)) {
                                for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()) {
                                    name = dataSnapshot2.child("Name of the Guest Faculty:").getValue().toString();

                                    topic = dataSnapshot2.child("Lecture Topic:").getValue().toString();
                                    c++;

                                    semrate = dataSnapshot2.child("Overall rating of the guest lecture").getValue().toString();
                                    total = total + Float.valueOf(semrate);
                                }

                            }
                        }


                        Toast.makeText(Sem.this, c + "", Toast.LENGTH_SHORT).show();

                        button5.setVisibility(View.INVISIBLE);
                        i = ((total / (c * 5)) * 100);
                        textView12.setText(i + "%");
                        textView9.setText(name);
                        textView28.setText(topic);
                /*final String date=textView7.getText().toString();
                mref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        float total = 0;
                        String chdate, semrate;
                        for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                            semrate = dataSnapshot1.child("Overall rating of the guest lecture").getValue().toString();
                            chdate = dataSnapshot1.child("Select Date").getValue().toString();
                            if (chdate.equals(date)) {
                                total = total + Float.parseFloat(semrate);
                                textView8.setText(total + " ");
                            }

                        }
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
*/
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });
            }
        });
    }
    }

