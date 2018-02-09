package com.example.shymacbook.geoquiz;

/**
 * Created by shymacbook on 2/8/18.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int TextResId, boolean answerTrue){
        mTextResId = TextResId;
        mAnswerTrue = answerTrue;

    }


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }



}
