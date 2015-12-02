package com.example.loc14143386.myapplication;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //variables go here
    private Button btnFalse;
    private Button btnTrue;
    private TextView tblQuestion;
    private ImageView imgPicture;
    private TextView lblscore;


    private List<QuestionObject> questions;
    private QuestionObject currentQuestion;
    private int index;
    private int score;
    private Button btnHint;

    //Button true and button false code goes here //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFalse = (Button) findViewById(R.id.btnFalse);
        btnTrue = (Button) findViewById(R.id.btnTrue);
        tblQuestion = (TextView) findViewById(R.id.lblQuestion);
        imgPicture = (ImageView) findViewById(R.id.imgPicture);
        lblscore = (TextView) findViewById(R.id.lblscore);
        btnHint = (Button) findViewById((R.id.btnHint));


        index = 0;
        score =0;

lblscore.setText("score " + score);

        //Oncclick Listeners

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                determineButtonPress(false);
            }
        });


        // Shows Correct Answer //
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                determineButtonPress(true);
            }
        });


        btnHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Look at Google for all information for electronic games.", Toast.LENGTH_SHORT).show();
            }
        });


        generateQuestions();

        setUpQuestion();



    } // ends onCreate

// Questions go here. //
    private void generateQuestions(){

        questions = new ArrayList<>();
        QuestionObject one = new QuestionObject("Dan Klistner invented Bop It.",true, R.drawable.klistner);
        questions.add(one);
        QuestionObject two = new QuestionObject("Bop It Original was made in 1996.",true, R.drawable.bopit1996);
        questions.add(two) ;
        QuestionObject three = new QuestionObject("Dan Klistner's company, KID Group, made a prototype for Bop It Bounce.",false, R.drawable.bopit2010);
        questions.add(three) ;
        QuestionObject four = new QuestionObject("Bop It was re-designed in 2008 in an oval shape.",true, R.drawable.bopit2008logo);
        questions.add (four) ;
        QuestionObject five = new QuestionObject("Tiger Electronics released a game with six coloured knobs sticking out in 1996.",true, R.drawable.tigerelectronics);
        questions.add(five) ;
        QuestionObject six = new QuestionObject("Bop It Extreme was re-released with Bop It Shout programming in 2011.",true, R.drawable.bopit2008logo);
        questions.add(six) ;
        QuestionObject seven = new QuestionObject("Simon was re-invented by Klistner in 2013.",true, R.drawable.simonswipelogo);
        questions.add(seven) ;
        QuestionObject eight = new QuestionObject ("Most electronic games have a hidden test mode.", true, R.drawable.bopit2008logo);
        questions.add(eight);
        QuestionObject nine = new QuestionObject ("Electronic games with no visual tasks are played by people who are blind.",true, R.drawable.braile);
        questions.add(nine) ;
        QuestionObject ten = new QuestionObject ("Brian Goldner, CEO of Hasbro, says that Bop It is one of the most annoying games on the market.",false, R.drawable.goldner);
        questions.add(ten) ;


    }
    private void setUpQuestion() {
        if (index == questions.size()) {

            //they used up all their questions to end the game.
            Log.d("MyApplication2", "End s all the questions");
            //endGame();
            index = 0;
            score = 0;
            lblscore.setText("score = " + score);
            Toast.makeText(getApplicationContext(), "This game is finished! Wanna play again?", Toast.LENGTH_LONG).show();
      }


            // set up nroaml questions
            currentQuestion = questions.get(index);

            tblQuestion.setText(currentQuestion.getQuestion());
            imgPicture.setImageResource(currentQuestion.getPicture());

            index++;
            lblscore.setText("score = " + score);


    }

    private void determineButtonPress(boolean theirAnswer){

        //check if their answer matches expected answer
                //right

        if (theirAnswer == currentQuestion.isAnswer()){
            //correct
             Toast.makeText(MainActivity.this, "correct!!", Toast.LENGTH_SHORT).show();
            score++;


        } else{
            //false
              Toast.makeText(MainActivity.this, "wrong!!", Toast.LENGTH_SHORT).show();


        }

        setUpQuestion();


    }








} //ends activity








