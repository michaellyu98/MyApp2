package com.example.user.myapp2.Calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.myapp2.Main.MainActivity;
import com.example.user.myapp2.R;



public class Calc extends Activity implements View.OnClickListener {

    EditText numOne, numTwo;
    Button bAdd, bSub, bMul, bDiv, returnMain;
    TextView textResult;
    String num1, num2;
    int result;
    CalcService service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        service = new CalcServiceImpl();
        numOne = (EditText) findViewById(R.id.numOne);
        numTwo = (EditText) findViewById(R.id.numTwo);

        bAdd = (Button) findViewById(R.id.bAdd);
        bSub = (Button) findViewById(R.id.bSub);
        bMul = (Button) findViewById(R.id.bMul);
        bDiv = (Button) findViewById(R.id.bDiv);
        textResult = (TextView) findViewById(R.id.textResult);
        ((Button)findViewById(R.id.returnMain)).setOnClickListener(this);


        bAdd.setOnClickListener(this);
        bSub.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDiv.setOnClickListener(this);


    }



        @Override
        public void onClick (View v){

            int result = 0;

            switch (v.getId()) {
                case R.id.bAdd:
                    num1 = numOne.getText().toString();
                    num2 = numTwo.getText().toString();
                    result = service.plus(Integer.parseInt(num1), Integer.parseInt(num2));
                    break;
                case R.id.bSub:
                    num1 = numOne.getText().toString();
                    num2 = numTwo.getText().toString();
                    result = service.minus(Integer.parseInt(num1), Integer.parseInt(num2));
                    break;
                case R.id.bMul:
                    num1 = numOne.getText().toString();
                    num2 = numTwo.getText().toString();
                    result = service.multi(Integer.parseInt(num1), Integer.parseInt(num2));
                    break;
                case R.id.bDiv:
                    num1 = numOne.getText().toString();
                    num2 = numTwo.getText().toString();
                    result = service.divide(Integer.parseInt(num1), Integer.parseInt(num2));
                    break;
                case R.id.returnMain:
                    startActivity(new Intent(this, MainActivity.class));
            }

            textResult.setText("결과는  " + result);
        }
    }

//        btnDone.setOnClickListener(this);
//        bAdd.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                num1 = numOne.getText().toString();
//                num2 = numTwo.getText().toString();
//                result = Integer.parseInt(num1) + Integer.parseInt(num2);
//                textResult.setText("더했습니다  " + result);
//                return false;
//            }
//        });

//        bSub.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                num1 = numOne.getText().toString();
//                num2 = numTwo.getText().toString();
//                result = Integer.parseInt(num1) - Integer.parseInt(num2);
//                textResult.setText("뺏습니다 " + result);
//                return false;
//            }
//        });

//        bMul.setOnTouchListener(new View.OnTouchListener() {
//            @Override//           public boolean onTouch(View v, MotionEvent event) {
//                num1 = numOne.getText().toString();
//                num2 = numTwo.getText().toString();
//                result = Integer.parseInt(num1) * Integer.parseInt(num2);
//                textResult.setText("곱했습니다 " + result);
//                return false;
//            }
//        });
//
//        bDiv.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                num1 = numOne.getText().toString();
//                num2 = numTwo.getText().toString();
//                result = Integer.parseInt(num1) / Integer.parseInt(num2);
//                textResult.setText("나누었습니다 " + result);
//                return false;
//            }
 //       });
 //   }


 //       switch (v.getId()) {
 //           case R.id.bAdd:
 //               num1 = numOne.getText().toString();
 //               num2 = numTwo.getText().toString();
//                result = Integer.parseInt(num1) + Integer.parseInt(num2);
//                textResult.setText("더했습니다  " + result);
  //              return true;
 //           case R.id.bSub:
 //               num1 = numOne.getText().toString();
 //               num2 = numTwo.getText().toString();
 //               result = Integer.parseInt(num1) - Integer.parseInt(num2);
 //               textResult.setText("뺐습니다  " + result);
 //               return true;
 //       }
 //       return false;
 //   }
//}
