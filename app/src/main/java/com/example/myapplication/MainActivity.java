package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeConf(mhours(), mminutes());
            }
        });
    }
    //時を取得
    private String mhours(){
        EditText Ehour=(EditText)this.findViewById(R.id.hour);
        String hour = Ehour.getText().toString();
        return hour;
    }
    //分を取得
    private String mminutes(){
        EditText Eminute=(EditText)this.findViewById(R.id.minute);
        String minute = Eminute.getText().toString();
        return minute;
    }
    //設定した時刻を表示
    private void timeConf(String h, String m){
        TextView confview=(TextView)this.findViewById(R.id.textView2);
        confview.setText("設定した時間は　" + h + "：" + m);
    }
    }