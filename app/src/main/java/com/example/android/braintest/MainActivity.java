package com.example.android.braintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitAnswer(View view) {

        int answer = 0;

        EditText textName = (EditText) findViewById(R.id.name);
        String customerName = textName.getText().toString();

        /**
         * Lines of code below check for radio buttons in question 1 if pressed or not.
         */
        RadioButton q1_1_radioButton = (RadioButton) findViewById(R.id.button_q1_1);
        boolean q1_11_radioButton = q1_1_radioButton.isChecked();

        /**
         * Lines of code below check for radio buttons in question 2 if pressed or not.
         */
        RadioButton q2_3_radioButton = (RadioButton) findViewById(R.id.button_q2_3);
        boolean q2_33_radioButton = q2_3_radioButton.isChecked();


        /**
         * Lines of code below check for checkbox buttons in question 3 if pressed or not.
         */
        CheckBox q3_1_CheckBox = (CheckBox) findViewById(R.id.button_q3_1);
        boolean q3_11_CheckBox = q3_1_CheckBox.isChecked();
        CheckBox q3_2_CheckBox = (CheckBox) findViewById(R.id.button_q3_2);
        boolean q3_22_CheckBox = q3_2_CheckBox.isChecked();
        CheckBox q3_3_CheckBox = (CheckBox) findViewById(R.id.button_q3_3);
        boolean q3_33_CheckBox = q3_3_CheckBox.isChecked();
        CheckBox q3_4_CheckBox = (CheckBox) findViewById(R.id.button_q3_4);
        boolean q3_44_CheckBox = q3_4_CheckBox.isChecked();

        /**
         * Lines of code below check for checkbox buttons in question 4 if pressed or not.
         */
        CheckBox q4_1_CheckBox = (CheckBox) findViewById(R.id.button_q4_1);
        boolean q4_11_CheckBox = q4_1_CheckBox.isChecked();
        CheckBox q4_2_CheckBox = (CheckBox) findViewById(R.id.button_q4_2);
        boolean q4_22_CheckBox = q4_2_CheckBox.isChecked();
        CheckBox q4_3_CheckBox = (CheckBox) findViewById(R.id.button_q4_3);
        boolean q4_33_CheckBox = q4_3_CheckBox.isChecked();
        CheckBox q4_4_CheckBox = (CheckBox) findViewById(R.id.button_q4_4);
        boolean q4_44_CheckBox = q4_4_CheckBox.isChecked();

        /**
         * Lines of code below check for radio buttons in question 5 if pressed or not.
         */
        RadioButton q5_4_radioButton = (RadioButton) findViewById(R.id.button_q5_4);
        boolean q5_44_radioButton = q5_4_radioButton.isChecked();

        /**
         * Lines of code below check for radio buttons in question 6 if pressed or not.
         */
        RadioButton q6_2_radioButton = (RadioButton) findViewById(R.id.button_q6_2);
        boolean q6_22_radioButton = q6_2_radioButton.isChecked();


        /**
         * Lines of code below check for checkbox buttons in question 7 if pressed or not.
         */
        CheckBox q7_1_CheckBox = (CheckBox) findViewById(R.id.button_q7_1);
        boolean q7_11_CheckBox = q7_1_CheckBox.isChecked();
        CheckBox q7_2_CheckBox = (CheckBox) findViewById(R.id.button_q7_2);
        boolean q7_22_CheckBox = q7_2_CheckBox.isChecked();
        CheckBox q7_3_CheckBox = (CheckBox) findViewById(R.id.button_q7_3);
        boolean q7_33_CheckBox = q7_3_CheckBox.isChecked();
        CheckBox q7_4_CheckBox = (CheckBox) findViewById(R.id.button_q7_4);
        boolean q7_44_CheckBox = q7_4_CheckBox.isChecked();

        /**
         * Lines of code below check for checkbox buttons in question 8 if pressed or not.
         */
        CheckBox q8_1_CheckBox = (CheckBox) findViewById(R.id.button_q8_1);
        boolean q8_11_CheckBox = q8_1_CheckBox.isChecked();
        CheckBox q8_2_CheckBox = (CheckBox) findViewById(R.id.button_q8_2);
        boolean q8_22_CheckBox = q8_2_CheckBox.isChecked();
        CheckBox q8_3_CheckBox = (CheckBox) findViewById(R.id.button_q8_3);
        boolean q8_33_CheckBox = q8_3_CheckBox.isChecked();
        CheckBox q8_4_CheckBox = (CheckBox) findViewById(R.id.button_q8_4);
        boolean q8_44_CheckBox = q8_4_CheckBox.isChecked();


        /**
         * Lines of code below check for checkbox buttons in question 9 if pressed or not.
         */
        CheckBox q9_1_CheckBox = (CheckBox) findViewById(R.id.button_q9_1);
        boolean q9_11_CheckBox = q9_1_CheckBox.isChecked();
        CheckBox q9_2_CheckBox = (CheckBox) findViewById(R.id.button_q9_2);
        boolean q9_22_CheckBox = q9_2_CheckBox.isChecked();
        CheckBox q9_3_CheckBox = (CheckBox) findViewById(R.id.button_q9_3);
        boolean q9_33_CheckBox = q9_3_CheckBox.isChecked();
        CheckBox q9_4_CheckBox = (CheckBox) findViewById(R.id.button_q9_4);
        boolean q9_44_CheckBox = q9_4_CheckBox.isChecked();

        /**
         * Lines of code below check for radio buttons in question 10 if pressed or not.
         */
        RadioButton q10_3_radioButton = (RadioButton) findViewById(R.id.button_q10_3);
        boolean q10_33_radioButton = q10_3_radioButton.isChecked();

        answer = checkAnswer(q1_11_radioButton, q2_33_radioButton,
                q3_11_CheckBox, q3_22_CheckBox, q3_44_CheckBox, q4_11_CheckBox, q4_22_CheckBox,
                q4_44_CheckBox, q5_44_radioButton, q6_22_radioButton, q7_11_CheckBox, q7_44_CheckBox,
                q8_11_CheckBox, q8_22_CheckBox, q8_33_CheckBox, q9_44_CheckBox, q10_33_radioButton,
                q3_33_CheckBox, q4_33_CheckBox, q7_33_CheckBox, q7_22_CheckBox, q8_44_CheckBox,
                q9_11_CheckBox, q9_22_CheckBox, q9_33_CheckBox);

        /**
         * Displays the score in a toast.
         */
        Toast.makeText(this, customerName + " your score is " + answer + " out of 10! \n        " +
                "                       \n                              Nice try", Toast.LENGTH_LONG).show();
        return;

    }

    private int checkAnswer(boolean q1_11_radioButton, boolean q2_33_radioButton,
                            boolean q3_11_CheckBox, boolean q3_22_CheckBox, boolean q3_44_CheckBox,
                            boolean q4_11_CheckBox, boolean q4_22_CheckBox, boolean q4_44_CheckBox,
                            boolean q5_44_radioButton, boolean q6_22_radioButton, boolean q7_11_CheckBox,
                            boolean q7_44_CheckBox, boolean q8_11_CheckBox, boolean q8_22_CheckBox,
                            boolean q8_33_CheckBox, boolean q9_44_CheckBox, boolean q10_33_radioButton,
                            boolean q3_33_CheckBox, boolean q4_33_CheckBox, boolean q7_22_CheckBox,
                            boolean q7_33_CheckBox, boolean q8_44_CheckBox, boolean q9_11_CheckBox,
                            boolean q9_22_CheckBox, boolean q9_33_CheckBox) {

        int answerCount = 0;
        /**
         * checking question 1 radiobutton.
         */
        if (q1_11_radioButton) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 2 radiobutton.
         */
        if (q2_33_radioButton) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 3 checkbox.
         */
        if (q3_11_CheckBox && q3_22_CheckBox && q3_44_CheckBox && !q3_33_CheckBox) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 4 checkbox.
         */
        if (q4_11_CheckBox && q4_22_CheckBox && q4_44_CheckBox && !q4_33_CheckBox) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 5 radiobutton.
         */
        if (q5_44_radioButton) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 6 radiobutton.
         */
        if (q6_22_radioButton) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 7 checkbox.
         */
        if (q7_11_CheckBox && q7_44_CheckBox && !q7_22_CheckBox && !q7_33_CheckBox) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 8 checkbox.
         */
        if (q8_11_CheckBox && q8_22_CheckBox && q8_33_CheckBox && !q8_44_CheckBox) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 9 checkbox.
         */
        if (q9_44_CheckBox && !q9_11_CheckBox && !q9_22_CheckBox && !q9_33_CheckBox) {
            answerCount = answerCount + 1;
        }
        /**
         * checking question 10 radiobutton.
         */
        if (q10_33_radioButton) {
            answerCount = answerCount + 1;
        }

        return answerCount;
    }
}




