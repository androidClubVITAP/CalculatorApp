package com.example.piyush.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    //initialize required variables

    String msg1 = "";
    String msg2 = "";
    String msg3 = "";
    int op;
    int answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //function definition for all the num buttons

    public void uno(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "1";
        line.setText(msg1);
    }
    public void two(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "2";
        line.setText(msg1);
    }
    public void three(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "3";
        line.setText(msg1);
    }
    public void four(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "4";
        line.setText(msg1);
    }
    public void five(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "5";
        line.setText(msg1);
    }
    public void six(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "6";
        line.setText(msg1);
    }
    public void seven(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "7";
        line.setText(msg1);
    }
    public void eight(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "8";
        line.setText(msg1);
    }
    public void nine(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "9";
        line.setText(msg1);
    }
    public void zero(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        msg1 = line.getText() + "0";
        line.setText(msg1);
    }

    //function definition for +,-,*,/ operations

    public void plus(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        line.setText("");
        msg2 = msg1;
        op = 1;
    }
    public void minus(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        line.setText("");
        msg2 = msg1;
        op = 2;
    }
    public void mult(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        line.setText("");
        msg2 = msg1;
        op = 3;
    }
    public void divide(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        line.setText("");
        msg2 = msg1;
        op = 4;
    }

    //funtion definition for Clear button

    public void cl(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        line.setText("");
    }

    //function definition for equals button and calculation

    public void equals(View view){
        TextView line = (TextView) findViewById(R.id.textView);
        if (op == 1){
            answer = parseInt(msg1) + parseInt(msg2);
            line.setText(Integer.toString(answer));
        }
        if (op == 2){
            answer = parseInt(msg1) - parseInt(msg2);
            line.setText(Integer.toString(answer));
        }
        if (op == 3){
            answer = parseInt(msg1) * parseInt(msg2);
            line.setText(Integer.toString(answer));
        }
        if (op == 4){
            if (parseInt(msg2) != 0 && parseInt(msg1) == 0){
                line.setText("Infinity");
            }
            else{
                answer = parseInt(msg1) / parseInt(msg2);
                line.setText(Integer.toString(answer));
            }
        }
    }
}
