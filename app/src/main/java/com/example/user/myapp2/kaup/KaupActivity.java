package com.example.user.myapp2.kaup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.myapp2.R;



public class KaupActivity extends Activity implements  View.OnClickListener{

    EditText TextName, TextWeight, TextHeight;
    Button btnDone;
    TextView textResult;
    String Name, Weight, Height;
    String resultMsg;
    double weight, height;
    int resultid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaup);


        TextName =   (EditText)findViewById(R.id.EditTextName);
        TextWeight = (EditText)findViewById(R.id.EditTextWeight);
        TextHeight = (EditText)findViewById(R.id.EditTextHeight);

        btnDone = (Button)findViewById(R.id.btnDone);
        textResult = (TextView)findViewById(R.id.textResult);

        btnDone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Name = TextName.getText().toString();
        weight = Double.parseDouble(TextWeight.getText().toString());
        height = Double.parseDouble(TextHeight.getText().toString());

        KaupService service = new KaupServiceImpl();  // 인스턴스 instance
        resultMsg = service.getKaup(weight, height);

        textResult.setText("몸무계 " + weight + "키 " + height + "Index " + resultid +"결과 " + resultMsg);
    }


}
