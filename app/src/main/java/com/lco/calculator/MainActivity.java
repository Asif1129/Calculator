package com.lco.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,
    buttonSub,buttonMul,buttonDiv,buttonC,buttonEqual,button00,button02;
    EditText ed;
    float mValueOne , mValueTwo ;
    int a,s;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=findViewById(R.id.b0);
        button1=findViewById(R.id.b1);
        button2=findViewById(R.id.b2);
        button3=findViewById(R.id.b3);
        button4=findViewById(R.id.b4);
        button5=findViewById(R.id.b5);
        button6=findViewById(R.id.b6);
        button7=findViewById(R.id.b7);
        button8=findViewById(R.id.b8);
        button9=findViewById(R.id.b9);
        buttonAdd=findViewById(R.id.badd);
        buttonC=findViewById(R.id.bc);
        buttonDiv=findViewById(R.id.bdiv);
        buttonEqual=findViewById(R.id.bequal);
        buttonMul=findViewById(R.id.bmul);
        buttonSub=findViewById(R.id.bsub);
        button00=findViewById(R.id.b01);
        button02=findViewById(R.id.b02);
        ed=findViewById(R.id.res);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"1");
            }
        });
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"00");
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s < 1) {
                    ed.setText(ed.getText() + ".");
                    s++;
                } else {
                    Toast.makeText(getApplicationContext(), "No!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try {
                        if (ed == null) {
                            ed.setText("");


                        } else {
                            mValueOne = Float.parseFloat(ed.getText() + "");
                            mAddition = true;
                            ed.setText(null);
                            s=0;
                        }
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"empty feild",Toast.LENGTH_SHORT).show();
                    }


            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (ed == null) {
                        ed.setText("");


                    } else {
                        mValueOne = Float.parseFloat(ed.getText() + "");
                        mSubtract = true;
                        ed.setText(null);
                        s=0;
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"empty feild",Toast.LENGTH_SHORT).show();
                }

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (ed == null) {
                        ed.setText("");


                    } else {
                        mValueOne = Float.parseFloat(ed.getText() + "");
                        mMultiplication = true;
                        ed.setText(null);
                        s=0;
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"empty feild",Toast.LENGTH_SHORT).show();
                }

            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (ed == null) {
                        ed.setText("");


                    } else {
                        mValueOne = Float.parseFloat(ed.getText() + "");
                        mDivision = true;
                        ed.setText(null);
                        s=0;
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"empty feild",Toast.LENGTH_SHORT).show();
                }

            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(ed.getText() + "");

                if (mAddition == true){

                    ed.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    ed.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    ed.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    ed.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText("");
                s=0;
            }
        });
    };





    }

