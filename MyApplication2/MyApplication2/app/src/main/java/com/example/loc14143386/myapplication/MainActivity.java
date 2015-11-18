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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //variables go here
    private Button btnFalse;
    private Button btnTrue;
    private TextView tblQuestion;
    private ImageView imgPicture;

    private List<QuestionObject> questions;
    private QuestionObject currentQuestion;
    private int index;
    private int score;

    //Button true and button false code goes here //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFalse = (Button) findViewById(R.id.btnFalse);
        btnTrue = (Button) findViewById(R.id.btnTrue);
        tblQuestion = (TextView) findViewById(R.id.lblQuestion);
        imgPicture = (ImageView) findViewById(R.id.imgPicture);

        index = 0;
        score = 0;

        //Oncclick Listeners

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                //wrong!!!
              //  Toast.makeText(MainActivity.this, "wrong!!", Toast.LENGTH_SHORT).show();
=======


>>>>>>> origin/master
                determineButtonPress(false);
            }
        });


        // Shows Correct Answer //
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                //correct!
              //  Toast.makeText(MainActivity.this, "correct!!", Toast.LENGTH_SHORT).show();
                determineButtonPress(true);
=======
                determineButtonPress(true);

>>>>>>> origin/master

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
        QuestionObject three = new QuestionObject("Dan Klistner invented Bop It Bounce.",false, R.drawable.bopit2010);
        questions.add(three) ;
        QuestionObject four = new QuestionObject("Bop It was re-designed in 2008 in an oval shape.",true, R.drawable.bopit2008logo);
        questions.add (four) ;
        QuestionObject five = new QuestionObject("Tiger Electronics released a game with six coloured knobs sticking out in 1996.",true, R.drawable.tigerelectronics);
        questions.add (five) ;
        QuestionObject six = new QuestionObject("Bop It Extreme was re-released with Bop It Shout programming in 2011.",true, R.drawable.bopit2008logo);
        questions.add (six) ;
        QuestionObject seven = new QuestionObject("Simon was re-invented by Klistner in 2013.",true, R.drawable.simonswipelogo);
        questions.add (seven) ;
        QuestionObject eight = new QuestionObject ("Most electronic games have a hidden test mode.", true, R.drawable.bopit2008logo);
        questions.add (eight);
        QuestionObject nine = new QuestionObject ("Electronic games with no visual tasks are played by people who are blind.",true, R.drawable.braile);
        questions.add (nine) ;
        QuestionObject ten = new QuestionObject ("Brian Goldner, CEO of Hasbro, says that Bop It is one of the most annoying games on the market.",false, R.drawable.goldner);
        questions.add (ten) ;


    }
    private void setUpQuestion(){
        currentQuestion = questions.get(index);

        tblQuestion.setText(currentQuestion.getQuestion());
        imgPicture.setImageResource(currentQuestion.getPicture());

        index++;
        if (index == 10) {
            index = 0;


        }
    }

    private void determineButtonPress(boolean theirAnswer){

        //check if their answer matches expected answer
                //right
        if (currentQuestion.isAnswer() == theirAnswer){

            ///here - tell them they were correct
            Toast.makeText(MainActivity.this, "right!", Toast.LENGTH_SHORT).show();

<<<<<<< HEAD
        if (theirAnswer == currentQuestion.isAnswer()){
            //correct
             Toast.makeText(MainActivity.this, "correct!!", Toast.LENGTH_SHORT).show();
              score++;


        } else{
            //false
              Toast.makeText(MainActivity.this, "wrong!!", Toast.LENGTH_SHORT).show();




        }
=======
        } else{
            //wrong answer
            Toast.makeText(MainActivity.this, "wrong!", Toast.LENGTH_SHORT).show();
>>>>>>> origin/master

       setUpQuestion();

        }

        setUpQuestion();


    }

} //ends activity








