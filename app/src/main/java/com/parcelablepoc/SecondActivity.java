package com.parcelablepoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i =getIntent();
        Bundle b = i.getExtras();
        Person p =b.getParcelable("parcel");
        String name = p.name;
        String surname = p.cellNumber;
        Toast.makeText(this, "here is your name  " + name + "  \nhere is your cell  " + surname, Toast.LENGTH_SHORT).show();
    }
}
