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
        Intent i = getIntent();
        Bundle b = i.getExtras();
        int getCount = b.getInt("count");
        String name;
        String surname;
        if (getCount == 1) {
            Person p = b.getParcelable("parcel");
            name = p.name;
            surname = p.cellNumber;

        } else {
            Person2 p = (Person2) b.getSerializable("serlizable");
            name = p.getFirstName();
            surname = p.getLastName();

        }
        Toast.makeText(this, "here is your name  " + name + "  \nhere is your cell  " + surname, Toast.LENGTH_SHORT).show();

    }
}
