package com.example.loc14143386.myapplication;

/**
 * Created by LOC14143386 on 07/10/2015.
 *
 *
 * This document of code generates questions and moves on to the next question if one of the true or false buttons is selected.
 *
 *
 */
// Declaring variables //
public class QuestionObject {

    private String question;
    private boolean answer;
    private int picture;

    public QuestionObject(String question, boolean answer, int picture) {

        this.question = question;
        this.answer = answer;
        this.picture = picture;
    }
    public String getQuestion() {
        return question;
    }
    public boolean isAnswer() {
return answer;
    }
    public int getPicture() {

        return picture;



    }


    }



