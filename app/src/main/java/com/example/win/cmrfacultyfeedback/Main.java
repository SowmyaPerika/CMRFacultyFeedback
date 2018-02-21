package com.example.win.cmrfacultyfeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private DatabaseReference mUserDatabase;
    private FirebaseUser mcurrentUser;
    private TextView textView,textView4;
    private Button academics,seminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setTitle("Welcome Page");

        Firebase.setAndroidContext(this);

        textView=(TextView)findViewById(R.id.textView);
        textView4=(TextView)findViewById(R.id.textView4);
        mAuth=FirebaseAuth.getInstance();
        mcurrentUser=FirebaseAuth.getInstance().getCurrentUser();
        if (mcurrentUser == null) {
            sendToStart();
        }else {
            String current_uid = mcurrentUser.getUid();
            mUserDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child(current_uid);

            mUserDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    String rollnumber = (String) dataSnapshot.child("rollnumber").getValue();
                    textView4.setText(rollnumber);
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {
                }
            });
        }
        academics=(Button)findViewById(R.id.acadamics);
        seminar=(Button)findViewById(R.id.seminar);
        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String roll= textView4.getText().toString();
                Intent intent=new Intent(Main.this,Branch.class);
                intent.putExtra("roll",roll);
                startActivity(intent);
            }
        });
        seminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main.this,Seminar.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        if (currentUser==null){
            sendToStart();
        }
    }
    private void sendToStart() {
        Intent i=new Intent(Main.this,MainActivity.class);
        startActivity(i);
        finish();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId()==R.id.main_logout_btn){
            FirebaseAuth.getInstance().signOut();
            sendToStart();
        }
        return true;
    }
}
