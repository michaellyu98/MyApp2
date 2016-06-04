package com.example.user.myapp2.kaup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USER on 2016-06-04.
 */
public class KaupServiceImpl implements KaupService{


    @Override
    public String getKaup(double weight, double height) {

        int resultid = (int)(weight*10000/(height*height));
        String resultMsg = "";

        if(resultid >= 30) {
            resultMsg = "비만";
        }else if(resultid > 24)
            resultMsg = "과체중";
        else if(resultid > 20)
            resultMsg = "정상";
        else if (resultid > 15)
            resultMsg = "저체중";
        else if (resultid > 13)
            resultMsg = "마름";
        else if(resultid > 10)
            resultMsg = "영양실조";
        else
            resultMsg = "소모증";

        return resultMsg;
    }
}
