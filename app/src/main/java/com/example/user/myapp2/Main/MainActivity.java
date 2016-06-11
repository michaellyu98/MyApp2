package com.example.user.myapp2.Main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.myapp2.Calc.Calc;
import com.example.user.myapp2.R;
import com.example.user.myapp2.kaup.KaupActivity;
import com.example.user.myapp2.login.LoginActivity;
import com.example.user.myapp2.signup.Main2Activity;

import static com.example.user.myapp2.R.id.btnCalc;
import static com.example.user.myapp2.R.id.btnKaup;
import static com.example.user.myapp2.R.id.btnlogin;

public class MainActivity extends Activity implements View.OnClickListener{

 //   Button btnKaup, btnCalc, btnlogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.btnKaup)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnCalc)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnlogin)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnSignup)).setOnClickListener(this);

            }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btnKaup:
                startActivity(new Intent(this, KaupActivity.class));
                ; break;
            case R.id.btnCalc:
                startActivity(new Intent(this, Calc.class));
                ; break;
            case R.id.btnlogin:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.btnSignup:
                startActivity(new Intent(this, Main2Activity.class));
                break;
        }
    }
}


