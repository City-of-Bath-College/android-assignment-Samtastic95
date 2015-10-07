package com.example.loc14143386.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variables go here
    private Button btnFalse;
    private Button btnTrue;
    private TextView tblQuestion;
    private ImageView imgPicture;

   // private List<QuestionObject> questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFalse = (Button)findViewById(R.id.btnFalse);
        btnTrue = (Button) findViewById(R. id.btnTrue);
        tblQuestion = (TextView) findViewById(R. id. lblQuestion);
        imgPicture = (ImageView) findViewById(R. id. imgPicture);



        //Oncclick Listeners

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //wrong!!!
                Toast.makeText(MainActivity.this, "wrong!!", Toast.LENGTH_SHORT).show();
            }
        });

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //correct!
                Toast.makeText(MainActivity.this, "correct!!", Toast.LENGTH_SHORT).show();
            }
        });

    } // ends onCreate


} //ends activity








