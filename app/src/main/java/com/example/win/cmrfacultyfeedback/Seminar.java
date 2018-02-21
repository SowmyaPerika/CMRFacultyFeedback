package com.example.win.cmrfacultyfeedback;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;

import static com.google.firebase.database.FirebaseDatabase.getInstance;

public class Seminar extends AppCompatActivity {
    private DatabaseReference mref;
    private Button picDate;
    private EditText faculty;
    private EditText topic;
    private TextView mDisplay;
    private TextView tview1,tview2,tview0,tview3,tview4,tview5,tview6,tv2;
    private Button submit;
    private RatingBar rate;
    String choice,choice1,choice2,choice3,choice4;
    private DatePickerDialog.OnDateSetListener mDateListener;
    Spinner spin,spin1,spin2,spin3,spin4;
    ArrayAdapter<CharSequence> adapter;
    float i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seminar);

        setTitle("Seminar");
        Firebase.setAndroidContext(this);
        final DatabaseReference mref= getInstance().
                getReferenceFromUrl("https://cmrfacultyfeedback-abc78.firebaseio.com/facultyDetails");

        spin=(Spinner)findViewById(R.id.spin);
        spin1=(Spinner)findViewById(R.id.spin1);
        spin2=(Spinner)findViewById(R.id.spin2);
        spin3=(Spinner)findViewById(R.id.spin3);
        spin4=(Spinner)findViewById(R.id.spin4);

        final ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(Seminar.this,
                R.array.yes_no,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                choice=(String) parent.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Seminar.this,"Please select any subject",Toast.LENGTH_LONG).show();

            }
        });
        spin1.setAdapter(adapter);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                choice1=(String) parent.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Seminar.this,"Please select any subject",Toast.LENGTH_LONG).show();

            }
        });
        spin2.setAdapter(adapter);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                choice2=(String) parent.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Seminar.this,"Please select any subject",Toast.LENGTH_LONG).show();

            }
        });
        spin3.setAdapter(adapter);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                choice3=(String) parent.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Seminar.this,"Please select any subject",Toast.LENGTH_LONG).show();

            }
        });
        spin4.setAdapter(adapter);
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                choice4=(String) parent.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Seminar.this,"Please select any subject",Toast.LENGTH_LONG).show();

            }
        });

        picDate = (Button) findViewById(R.id.picDate);
        mDisplay = (TextView) findViewById(R.id.tview);
        tv2=(TextView)findViewById(R.id.tv2);
        tview1=(TextView)findViewById(R.id.tview1);
        tview2=(TextView)findViewById(R.id.tview2);
        tview0=(TextView)findViewById(R.id.tview0);
        tview3=(TextView)findViewById(R.id.tview3);
        tview4=(TextView)findViewById(R.id.tview4);
        tview5=(TextView)findViewById(R.id.tview5);
        tview6=(TextView)findViewById(R.id.tview6);
        faculty=(EditText)findViewById(R.id.editext1);
        topic=(EditText)findViewById(R.id.editext2);
        submit=(Button)findViewById(R.id.button3);
        rate=(RatingBar)findViewById(R.id.rate);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ed=mDisplay.getText().toString().trim().toUpperCase();
                String pic=picDate.getText().toString();
                String t=tv2.getText().toString();
                String tv=tview1.getText().toString();
                String tvv=tview2.getText().toString();
                String to=tview0.getText().toString();
                String t3=tview3.getText().toString();
                String t4=tview4.getText().toString();
                String t5=tview5.getText().toString();
                String t6=tview6.getText().toString();
                String fd=faculty.getText().toString();
                String td=topic.getText().toString();
                float ra=rate.getRating();

                mref.child(tview1.getText().toString()).setValue(fd);
                mref.child(tview2.getText().toString()).setValue(topic.getText().toString());

                mref.child(pic).setValue(ed);
                mref.child(to).setValue(choice);
                mref.child(t3).setValue(choice1);
                mref.child(t4).setValue(choice2);
                mref.child(t5).setValue(choice3);
                mref.child(t6).setValue(choice4);
                mref.child(t).setValue(ra);
                Toast.makeText(Seminar.this, "Rating Submitted", Toast.LENGTH_SHORT).show();
                Intent c=new Intent(Seminar.this,Conclusion.class);
                startActivity(c);
            }
        });

        picDate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(Seminar.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateListener, year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setTitle("select date");
                dialog.show();
            }
        });
        mDateListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                String date=year+"-"+month+"-"+dayOfMonth;
                mDisplay.setText(date);
            }
        };

    }
}
