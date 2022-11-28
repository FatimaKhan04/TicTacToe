package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    int flag=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);
        button5=findViewById(R.id.btn5);
        button6=findViewById(R.id.btn6);
        button7=findViewById(R.id.btn7);
        button8=findViewById(R.id.btn8);
        button9=findViewById(R.id.btn9);
    }

    public void Check(View view) {
        Button currentBtn = (Button) view;
        if (currentBtn.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                currentBtn.setText("X");
                flag = 1;
            } else {
                currentBtn.setText("O");
                flag = 0;
            }

            //Conditions
            if (count > 4) {
                //Get values and check all possible winning combinations
                btn_1 = button1.getText().toString();
                btn_2 = button2.getText().toString();
                btn_3 = button3.getText().toString();
                btn_4 = button4.getText().toString();
                btn_5 = button5.getText().toString();
                btn_6 = button6.getText().toString();
                btn_7 = button7.getText().toString();
                btn_8 = button8.getText().toString();
                btn_9 = button9.getText().toString();

                if (btn_1.equals(btn_2) && btn_2.equals(btn_3) && !btn_1.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_1, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_4.equals(btn_5) && btn_5.equals(btn_6) && !btn_4.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_5, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_7.equals(btn_8) && btn_8.equals(btn_9) && !btn_7.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_7, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_1.equals(btn_4) && btn_4.equals(btn_7) && !btn_1.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_1, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_2.equals(btn_5) && btn_5.equals(btn_8) && !btn_2.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_2, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_3.equals(btn_6) && btn_6.equals(btn_9) && !btn_3.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_3, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_1.equals(btn_5) && btn_5.equals(btn_9) && !btn_1.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_1, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_3.equals(btn_5) && btn_5.equals(btn_7) && !btn_3.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_1, Toast.LENGTH_SHORT).show();
                    reset();
                } else if (btn_1.equals(btn_2) && btn_2.equals(btn_3) && !btn_1.equals("")) {
                    Toast.makeText(this, "Winner is:" + btn_1, Toast.LENGTH_SHORT).show();
                    reset();
                }
                else if(!btn_1.equals("") && !btn_2.equals("") && !btn_3.equals("") &&
                        !btn_4.equals("") && !btn_5.equals("") && !btn_6.equals("") &&
                        !btn_7.equals("") && !btn_8.equals("") && !btn_9.equals("")
                ){

                    Toast.makeText(this, "Game is drawn:" , Toast.LENGTH_SHORT).show();
                    reset();
                }


            }

        }
    }

    public void reset(){
        count=0;
        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
    }
}