package simplecalculator.calculator;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    private double fnum=0; //first input
    private double snum=0; //second input
    private boolean textscreen; //screen
    private boolean lastdot = true; //check dot is press or not
    private boolean opestate =false; //for control first time press add,sub,mul,div
    private String temp; //store snum convert into double
    private int check= 0;
    private double result;
    private boolean equalcheck=false; //check equal is check or not
    private boolean useofequal = false; // for control first time press equal
    private boolean howequalwork=false; //control when user pres double time equal for resutl like: 5+2=7 press equal result is 9.
    //that means this time fnum = result.




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       final EditText textscreen =(EditText)findViewById(R.id.screen);


       Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);

        Button add = (Button)findViewById(R.id.add);
        Button sub =(Button)findViewById(R.id.sub);
        Button multi =(Button)findViewById(R.id.multi);
        Button division =(Button)findViewById(R.id.division);
        Button clr =(Button)findViewById(R.id.clr);
        Button dot =(Button)findViewById(R.id.dot);
        final Button equal=(Button)findViewById(R.id.equal);

        final Button undo = (Button)findViewById(R.id.undo);

        ImageView  imageView=(ImageView)findViewById(R.id.about);

        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str=textscreen.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    textscreen.setText(str);
                }
                else if (str.length() <=1 ) {
                    textscreen.setText("0");
                    lastdot=true;
                }
            }
        });




        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(MainActivity.this);
                alertdialogbuilder.setTitle("          About Developer");


                alertdialogbuilder.setMessage("\n"+"         Mithun Das\n" +"\n"+
                        "        Department of CSE,UAP\n" +
                        "        Email:mithuncse404@gmail.com");





                AlertDialog alertDialog = alertdialogbuilder.create();
                alertDialog.show();
            }
        });






        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "1");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "1");
                }
                opestate=true;
                useofequal = true;
                howequalwork=false;



            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "2");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "2");
                }
                opestate=true;
                useofequal = true;
                howequalwork=false;


            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "3");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "3");
                }

                opestate=true;
                useofequal = true;
                howequalwork=false;



            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "4");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "4");
                }

                opestate=true;
                useofequal = true;
                howequalwork=false;


            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "5");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "5");
                }

                opestate=true;
                useofequal = true;
                howequalwork=false;


            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "6");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "6");
                }


                opestate=true;
                useofequal = true;
                howequalwork=false;

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "7");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "7");
                }


                opestate=true;
                useofequal = true;
                howequalwork=false;

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "8");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "8");
                }

                opestate=true;
                useofequal = true;
                howequalwork=false;


            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "9");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "9");
                }

                opestate=true;
                useofequal = true;
                howequalwork=false;


            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (equalcheck==true){
                    textscreen.setText("");
                    textscreen.setText(textscreen.getText() + "0");
                    equalcheck=false;


                }
                else {
                    textscreen.setText(textscreen.getText() + "0");
                }

                opestate=true;
                useofequal = true;
                howequalwork=false;


            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textscreen.setText("");
                opestate=false;
                useofequal=false;
                howequalwork=false;
                 fnum=0;
                snum=0;
                lastdot=true;


            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(equalcheck==true){
                    textscreen.setText("");
                    if (lastdot == true)
                    {
                        textscreen.setText(textscreen.getText() + ".");

                    }

                }
                else {
                    if (lastdot == true)
                    {
                        textscreen.setText(textscreen.getText() + ".");

                    }
                }
                equalcheck=false;




                lastdot = false;
                opestate=false;
                useofequal = false;
                howequalwork=false;


            }
        });




            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (opestate==true)
                    {

                        temp = textscreen.getText().toString();
                        fnum = Double.parseDouble(temp);
                        textscreen.setText("");
                        check = 1;
                    }
                    else {

                    }

                    opestate=false;


                    lastdot = true;
                    howequalwork=false;
                    useofequal=false;



                }
            });






            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(opestate==true){

                        temp = textscreen.getText().toString();
                        fnum = Double.parseDouble(temp);
                        textscreen.setText("");
                        check = 2;

                    }

                    else {

                    }

                    opestate=false;
                    lastdot = true;
                    howequalwork=false;
                    useofequal=false;



                }
            });



            multi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (opestate==true){

                        temp = textscreen.getText().toString();
                        fnum = Double.parseDouble(temp);
                        textscreen.setText("");
                        check = 3;
                    }


                    else {

                    }

                    opestate=false;
                    lastdot = true;
                    howequalwork=false;
                    useofequal=false;


                }
            });



            division.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (opestate==true){

                        temp = textscreen.getText().toString();
                        fnum = Double.parseDouble(temp);
                        textscreen.setText("");
                        check = 4;
                    }
                    else {

                    }
                    opestate=false;
                    lastdot = true;
                    howequalwork=false;
                    useofequal=false;




                }
            });






            equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                        if (useofequal==true){

                            if (howequalwork==false){

                            opestate=false;

                            temp = textscreen.getText().toString();
                            snum = Double.parseDouble(temp);
                            textscreen.setText("");
                            if(check == 1)
                            {
                                result = fnum + snum;

                                if((int) result== result)
                                {
                                    temp = String.valueOf((int)result);
                                    textscreen.setText(temp);
                                }
                                else {
                                    temp = String.valueOf(result);
                                    textscreen.setText(temp);
                                }



                            }

                            if(check == 2)
                            {
                                result = fnum - snum;

                                if((int) result== result)
                                {
                                    temp = String.valueOf((int)result);
                                    textscreen.setText(temp);
                                }
                                else {
                                    temp = String.valueOf(result);
                                    textscreen.setText(temp);
                                }



                            }


                            if(check == 3)
                            {
                                result = fnum * snum;

                                if((int) result== result)
                                {
                                    temp = String.valueOf((int)result);
                                    textscreen.setText(temp);
                                }
                                else {
                                    temp = String.valueOf(result);
                                    textscreen.setText(temp);
                                }



                            }

                            if(check == 4)
                            {
                                result = fnum / snum;

                                if((int) result== result)
                                {
                                    temp = String.valueOf((int)result);
                                    textscreen.setText(temp);
                                }
                                else {
                                    temp = String.valueOf(result);
                                    textscreen.setText(temp);
                                }



                            }
                                howequalwork=true;
                            opestate=true;

                            }

                            else {




                                opestate=false;

                                temp = textscreen.getText().toString();
                                fnum = Double.parseDouble(temp);
                                textscreen.setText("");




                                if(check == 1)
                                {
                                    result = fnum + snum;

                                    if((int) result== result)
                                    {
                                        temp = String.valueOf((int)result);
                                        textscreen.setText(temp);
                                    }
                                    else {
                                        temp = String.valueOf(result);
                                        textscreen.setText(temp);
                                    }



                                }

                                if(check == 2)
                                {
                                    result = fnum - snum;

                                    if((int) result== result)
                                    {
                                        temp = String.valueOf((int)result);
                                        textscreen.setText(temp);
                                    }
                                    else {
                                        temp = String.valueOf(result);
                                        textscreen.setText(temp);
                                    }



                                }


                                if(check == 3)
                                {
                                    result = fnum * snum;

                                    if((int) result== result)
                                    {
                                        temp = String.valueOf((int)result);
                                        textscreen.setText(temp);
                                    }
                                    else {
                                        temp = String.valueOf(result);
                                        textscreen.setText(temp);
                                    }



                                }

                                if(check == 4)
                                {
                                    result = fnum / snum;

                                    if((int) result== result)
                                    {
                                        temp = String.valueOf((int)result);
                                        textscreen.setText(temp);
                                    }
                                    else {
                                        temp = String.valueOf(result);
                                        textscreen.setText(temp);
                                    }



                                }


                            }

                        }
                        else {

                        }









                        equalcheck=true;
                        lastdot=true;










                }



            });













    }

}
