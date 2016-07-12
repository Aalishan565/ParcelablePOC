package com.parcelablepoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button mBtnSend;
    private EditText mEtName;
    private EditText mEtCell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtName = (EditText) findViewById(R.id.et_name);
        mEtCell = (EditText) findViewById(R.id.et_cell);
        mBtnSend = (Button) findViewById(R.id.btn_send);
        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEtName.getText().toString();
                String cell = mEtCell.getText().toString();
                Person p = new Person();
                p.name = name;
                p.cellNumber = cell;
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("parcel", p);
                startActivity(i);

            }
        });
    }
}
