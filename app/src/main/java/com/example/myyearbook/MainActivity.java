package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //@SuppressLint("SetTextI18n")
    public void buttonClick(View view)
{
//TextView ChangedText = (TextView)findViewById(R.id.textView2);
//ChangedText.setText("Text has been changed");
     Intent i= new Intent(getApplicationContext(),NewActivity.class);
    startActivity(i);

}




}