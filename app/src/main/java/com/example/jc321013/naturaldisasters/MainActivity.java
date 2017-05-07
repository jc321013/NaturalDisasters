package com.example.jc321013.naturaldisasters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    Button button2;
    Button button3;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    //        button1 = (Button)findViewById(R.id.button1);
//        button2 = (Button)findViewById(R.id.button2);
//        button3 = (Button)findViewById(R.id.button3);






    //    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
//
//    private TextView mScoreView;
//    private TextView mQuestionView;
//    private Button mButtonChoice1;
//    private Button mButtonChoice2;
//    private Button mButtonChoice3;
//
//    private String mAnswer;
//    private int mScore = 0;
//    private int mQuestionNumber = 0;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mScoreView = (TextView) findViewById(R.id.score);
//        mQuestionView = (TextView) findViewById(R.id.question);
//        mButtonChoice1 = (Button) findViewById(R.id.choice1);
//        mButtonChoice2 = (Button) findViewById(R.id.choice2);
//        mButtonChoice3 = (Button) findViewById(R.id.choice3);
//
//        updatedQuestion();
//
//
//
//        //Start of Button Listener for Button1
//        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (mButtonChoice1.getText() == mAnswer) {
//                    mScore = mScore + 1;
//                    updateScore(mScore);
//                    updatedQuestion();
//                    //Creates options
//                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
//                    updatedQuestion();
//
//                }
//            }
//        });
//
//        //End of Button Listener for Button1
//
//
//        //Start of Button Listener for Button2
//        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (mButtonChoice2.getText() == mAnswer) {
//                    mScore = mScore + 1;
//                    updateScore(mScore);
//                    updatedQuestion();
//                    //Creates options
//                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
//                    updatedQuestion();
//
//                }
//            }
//        });
//
//        //End of Button Listener for Button2
//
//        //Start of Button Listener for Button3
//        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (mButtonChoice3.getText() == mAnswer) {
//                    mScore = mScore + 1;
//                    updateScore(mScore);
//                    updatedQuestion();
//                    //Creates options
//                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
//                    updatedQuestion();
//
//                }
//            }
//        });
//
//        //End of Button Listener for Button3
//
//
//    }
//    private void updatedQuestion(){
//        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
//        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
//        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
//        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
//
//        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
//        mQuestionNumber++;
//    }
//
//    private void updateScore(int point) {
//        mScoreView.setText("" + mScore);
//    }
}
